
package com.dao.model;


import com.pojos.model.PersonaentidadesId;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class dao_PersonaEntidadesId {
    private Session session;
    private Transaction tran;
        
private void iniciar() throws HibernateException{
        session=HibernateUtil.getSessionFactory().openSession();
        tran=session.beginTransaction();
    }
public List<PersonaentidadesId> listaPersonaEntidadesId() throws HibernateException{
        List<PersonaentidadesId> lista = null;
        try{
            iniciar();
            lista = session.createQuery("from Personaentidadesid").list();
            
        }finally{
            session.close();
        }
         return lista;
    }   
public void MetodoGrabarPersonaEntidadesId(PersonaentidadesId objetoPersonaentidadesId)throws  HibernateException{
    try{
        iniciar();
        session.save(objetoPersonaentidadesId);
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  } 
public void MetodoEliminarPersonaEntidadesId(PersonaentidadesId objetoPersonaentidadesId) throws  HibernateException{
    try{
        iniciar();
        session.delete(objetoPersonaentidadesId);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
public void MetodoActualizarPersonaEntidades(PersonaentidadesId objetoPersonaentidadesId)throws  HibernateException{
    try{
        iniciar();
        session.update(objetoPersonaentidadesId);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
   
}
