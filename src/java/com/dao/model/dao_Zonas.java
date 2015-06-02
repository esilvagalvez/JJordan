package com.dao.model;

import com.pojos.model.Zonas;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class dao_Zonas {
     private Session session;
    private Transaction tran;
        
private void iniciar() throws HibernateException{
        session=HibernateUtil.getSessionFactory().openSession();
        tran=session.beginTransaction();
    }
public List<Zonas> listaZonas() throws HibernateException{
        List<Zonas> lista = null;
        try{
            iniciar();
            lista = session.createQuery("from Zonas").list();
            
        }finally{
            session.close();
        }
         return lista;
    }   
public void MetodoGrabarZonas(Zonas objetoZonas)throws  HibernateException{
    try{
        iniciar();
        session.save(objetoZonas);
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  } 
public void MetodoEliminarZonas(Zonas objetoZonas) throws  HibernateException{
    try{
        iniciar();
        session.delete(objetoZonas);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
public void MetodoActualizarZonas(Zonas objetoZonas)throws  HibernateException{
    try{
        iniciar();
        session.update(objetoZonas);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
 
}
