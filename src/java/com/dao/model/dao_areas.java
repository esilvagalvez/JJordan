package com.dao.model;

import com.pojos.model.Areas;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class dao_areas {
    
    private Session session;
    private Transaction tran;
    // metodo par ainicializar sesion y trasacción 
    
private void iniciar() throws HibernateException{
        session=HibernateUtil.getSessionFactory().openSession();
        tran=session.beginTransaction();
    }

public List<Areas> listaAreas() throws HibernateException{
        List<Areas> lista = null;
        try{
            iniciar();
            lista = session.createQuery("from Areas").list();
            
        }finally{
            session.close();
        }
         return lista;
    }   

public void MetodoGrabarAreas(Areas objetoAreas)throws  HibernateException{
    try{
        iniciar();
        session.save(objetoAreas);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  } 

public void MetodoEliminarArea(Areas objetoArea)throws  HibernateException{
    try{
        iniciar();
        session.delete(objetoArea);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  } 

public void MetodoActualizarAreas(Areas objetoArea)throws  HibernateException{
    try{
        iniciar();
        session.update(objetoArea);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  } 

}
