package com.dao.model;

import com.pojos.model.Giros;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class dao_Giros {
    
    private Session session;
    private Transaction tran;
        
private void iniciar() throws HibernateException{
        session=HibernateUtil.getSessionFactory().openSession();
        tran=session.beginTransaction();
    }
public List<Giros> listaGiros() throws HibernateException{
        List<Giros> lista = null;
        try{
            iniciar();
            lista = session.createQuery("from Giros").list();
            
        }finally{
            session.close();
        }
         return lista;
    }   
public void MetodoGrabarGiros(Giros objetoGiros)throws  HibernateException{
    try{
        iniciar();
        session.save(objetoGiros);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  } 
public void MetodoEliminarGiros(Giros objetoGiros) throws  HibernateException{
    try{
        iniciar();
        session.delete(objetoGiros);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
public void MetodoActualizarGiros(Giros objetoGiros)throws  HibernateException{
    try{
        iniciar();
        session.update(objetoGiros);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
    
}
