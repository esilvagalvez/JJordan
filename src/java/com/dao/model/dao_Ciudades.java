package com.dao.model;



import com.pojos.model.Ciudades;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class dao_Ciudades {
     private Session session;
    private Transaction tran;
        
private void iniciar() throws HibernateException{
        session=HibernateUtil.getSessionFactory().openSession();
        tran=session.beginTransaction();
    }
public List<Ciudades> listaCiudades() throws HibernateException{
        List<Ciudades> lista = null;
        try{
            iniciar();
            lista = session.createQuery("from Ciudades").list();
            
        }finally{
            session.close();
        }
         return lista;
    }   
public void MetodoGrabarCiudades(Ciudades objCiudades)throws  HibernateException{
    try{
        iniciar();
        session.save(objCiudades);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  } 
public void MetodoEliminarBancos(Ciudades objetoCiudades) throws  HibernateException{
    try{
        iniciar();
        session.delete(objetoCiudades);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
public void MetodoActualizarBancos(Ciudades objetoCiudades)throws  HibernateException{
    try{
        iniciar();
        session.update(objetoCiudades);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
    
}
