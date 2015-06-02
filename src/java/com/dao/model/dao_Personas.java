package com.dao.model;

import com.pojos.model.Personas;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class dao_Personas {
 private Session session;
    private Transaction tran;
        
private void iniciar() throws HibernateException{
        session=HibernateUtil.getSessionFactory().openSession();
        tran=session.beginTransaction();
    }
public List<Personas> listaPersonas() throws HibernateException{
        List<Personas> lista = null;
        try{
            iniciar();
            lista = session.createQuery("from Personas").list();
            
        }finally{
            session.close();
        }
         return lista;
    }   
public void MetodoGrabarPersonas(Personas objetoPersonas)throws  HibernateException{
    try{
        iniciar();
        session.save(objetoPersonas);
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  } 
public void MetodoEliminarPersonas(Personas objetoPersonas) throws  HibernateException{
    try{
        iniciar();
        session.delete(objetoPersonas);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
public void MetodoActualizarPersonas(Personas objetoPersonas)throws  HibernateException{
    try{
        iniciar();
        session.update(objetoPersonas);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
      
}
