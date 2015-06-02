package com.dao.model;

import com.pojos.model.Direcciones;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class dao_Direcciones {
        private Session session;
    private Transaction tran;
        
private void iniciar() throws HibernateException{
        session=HibernateUtil.getSessionFactory().openSession();
        tran=session.beginTransaction();
    }
public List<Direcciones> listaDirecciones() throws HibernateException{
        List<Direcciones> lista = null;
        try{
            iniciar();
            lista = session.createQuery("from Direcciones").list();
            
        }finally{
            session.close();
        }
         return lista;
    }   
public void MetodoGrabarDireciones (Direcciones objetoDirecciones)throws  HibernateException{
    try{
        iniciar();
        session.save(objetoDirecciones);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  } 
public void MetodoEliminarDirecciones(Direcciones objetoDirecciones) throws  HibernateException{
    try{
        iniciar();
        session.delete(objetoDirecciones);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
public void MetodoActualizarDirecciones(Direcciones objetoDirecciones)throws  HibernateException{
    try{
        iniciar();
        session.update(objetoDirecciones);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
  
}
