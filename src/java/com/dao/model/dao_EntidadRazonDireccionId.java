package com.dao.model;


import com.pojos.model.EntidadrazondireccionesId;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class dao_EntidadRazonDireccionId {
    private Session session;
    private Transaction tran;
        
private void iniciar() throws HibernateException{
        session=HibernateUtil.getSessionFactory().openSession();
        tran=session.beginTransaction();
    }
public List<EntidadrazondireccionesId> listaEntidadesRazonDireccionesId() throws HibernateException{
        List<EntidadrazondireccionesId> lista = null;
        try{
            iniciar();
            lista = session.createQuery("from EntidadrazondireccionesId").list();
            
        }finally{
            session.close();
        }
         return lista;
    }   
public void MetodoGrabarEntidadRazonDireccionesId (EntidadrazondireccionesId objetoEntidadrazondireccionesId)throws  HibernateException{
    try{
        iniciar();
        session.save(objetoEntidadrazondireccionesId);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  } 
public void MetodoEliminarEntidadRazonDireccionId(EntidadrazondireccionesId objetoEntidadrazondireccionesId) throws  HibernateException{
    try{
        iniciar();
        session.delete(objetoEntidadrazondireccionesId);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
public void MetodoActualizarEntidadRazonDireccionId(EntidadrazondireccionesId objetoEntidadrazondireccionesId)throws  HibernateException{
    try{
        iniciar();
        session.update(objetoEntidadrazondireccionesId);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
   
}
