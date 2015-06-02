package com.dao.model;
import com.pojos.model.Subregiones;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class dao_SubRegoines {
     private Session session;
    private Transaction tran;
        
private void iniciar() throws HibernateException{
        session=HibernateUtil.getSessionFactory().openSession();
        tran=session.beginTransaction();
    }
public List<Subregiones> listaSubRegiones() throws HibernateException{
        List<Subregiones> lista = null;
        try{
            iniciar();
            lista = session.createQuery("from Personas").list();
            
        }finally{
            session.close();
        }
         return lista;
    }   
public void MetodoGrabarSubRegiones(Subregiones objetoSubregiones)throws  HibernateException{
    try{
        iniciar();
        session.save(objetoSubregiones);
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  } 
public void MetodoEliminarSubRegiones(Subregiones objetoSubregiones) throws  HibernateException{
    try{
        iniciar();
        session.delete(objetoSubregiones);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
public void MetodoActualizarSubRegiones(Subregiones objetoSubregiones)throws  HibernateException{
    try{
        iniciar();
        session.update(objetoSubregiones);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
 
}
