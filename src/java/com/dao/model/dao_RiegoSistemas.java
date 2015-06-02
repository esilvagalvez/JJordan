package com.dao.model;


import com.pojos.model.Riegosistemas;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class dao_RiegoSistemas {
    private Session session;
    private Transaction tran;
        
private void iniciar() throws HibernateException{
        session=HibernateUtil.getSessionFactory().openSession();
        tran=session.beginTransaction();
    }
public List<Riegosistemas> listaPersonas() throws HibernateException{
        List<Riegosistemas> lista = null;
        try{
            iniciar();
            lista = session.createQuery("from Riegosistemas").list();
            
        }finally{
            session.close();
        }
         return lista;
    }   
public void MetodoGrabarRiegoSistemas(Riegosistemas objetoRiegosistemas)throws  HibernateException{
    try{
        iniciar();
        session.save(objetoRiegosistemas);
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  } 
public void MetodoEliminarRiegoSistemas(Riegosistemas objetoRiegosistemas) throws  HibernateException{
    try{
        iniciar();
        session.delete(objetoRiegosistemas);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
public void MetodoActualizarRiegoSistemas(Riegosistemas objetoRiegosistemas)throws  HibernateException{
    try{
        iniciar();
        session.update(objetoRiegosistemas);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
  
}
