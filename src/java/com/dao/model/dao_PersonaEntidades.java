package com.dao.model;

import com.pojos.model.Personaentidades;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class dao_PersonaEntidades {
    private Session session;
    private Transaction tran;
        
private void iniciar() throws HibernateException{
        session=HibernateUtil.getSessionFactory().openSession();
        tran=session.beginTransaction();
    }
public List<Personaentidades> listaPersonaEntidades() throws HibernateException{
        List<Personaentidades> lista = null;
        try{
            iniciar();
            lista = session.createQuery("from Personaentidades").list();
            
        }finally{
            session.close();
        }
         return lista;
    }   
public void MetodoGrabarPersonaEntidades(Personaentidades objetoPersonaentidades)throws  HibernateException{
    try{
        iniciar();
        session.save(objetoPersonaentidades);
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  } 
public void MetodoEliminarPersonaEntidades(Personaentidades objetoPersonaentidades) throws  HibernateException{
    try{
        iniciar();
        session.delete(objetoPersonaentidades);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
public void MetodoActualizarPersonaEntidades(Personaentidades objetoPersonaentidades)throws  HibernateException{
    try{
        iniciar();
        session.update(objetoPersonaentidades);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
     
}
