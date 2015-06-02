package com.dao.model;


import com.pojos.model.Entidadrazondirecciones;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class dao_EntidadRazonDirecciones {
   
    private Session session;
    private Transaction tran;
        
private void iniciar() throws HibernateException{
        session=HibernateUtil.getSessionFactory().openSession();
        tran=session.beginTransaction();
    }
public List<Entidadrazondirecciones> listaEntidadesRazonDirecciones() throws HibernateException{
        List<Entidadrazondirecciones> lista = null;
        try{
            iniciar();
            lista = session.createQuery("from Entidadrazondireccion").list();
            
        }finally{
            session.close();
        }
         return lista;
    }   
public void MetodoGrabarEntidadRazonDireccion (Entidadrazondirecciones objetoEntidadrazondirecciones)throws  HibernateException{
    try{
        iniciar();
        session.save(objetoEntidadrazondirecciones);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  } 
public void MetodoEliminarEntidadRazonDireccion(Entidadrazondirecciones objetoEntidadrazondirecciones) throws  HibernateException{
    try{
        iniciar();
        session.delete(objetoEntidadrazondirecciones);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
public void MetodoActualizarEntidadRazonDireccion(Entidadrazondirecciones objetoEntidadrazondirecciones)throws  HibernateException{
    try{
        iniciar();
        session.update(objetoEntidadrazondirecciones);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
  
}
