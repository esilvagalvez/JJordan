package com.dao.model;

import com.pojos.model.Entidades;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class dao_Entidades {
   
    private Session session;
    private Transaction tran;
        
private void iniciar() throws HibernateException{
        session=HibernateUtil.getSessionFactory().openSession();
        tran=session.beginTransaction();
    }
public List<Entidades> listaEntidades() throws HibernateException{
        List<Entidades> lista = null;
        try{
            iniciar();
            lista = session.createQuery("from Entidades").list();
            
        }finally{
            session.close();
        }
         return lista;
    }   
public void MetodoGrabarEntidades (Entidades objetoEntidades)throws  HibernateException{
    try{
        iniciar();
        session.save(objetoEntidades);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  } 
public void MetodoEliminarEntidades(Entidades objetoEntidades) throws  HibernateException{
    try{
        iniciar();
        session.delete(objetoEntidades);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
public void MetodoActualizarEntidades(Entidades objetoEntidades)throws  HibernateException{
    try{
        iniciar();
        session.update(objetoEntidades);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
  
}
