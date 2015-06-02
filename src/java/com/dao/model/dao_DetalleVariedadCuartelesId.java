package com.dao.model;

import com.pojos.model.DetallevariedadcuartelesId;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class dao_DetalleVariedadCuartelesId {
         private Session session;
    private Transaction tran;
        
private void iniciar() throws HibernateException{
        session=HibernateUtil.getSessionFactory().openSession();
        tran=session.beginTransaction();
    }
public List<DetallevariedadcuartelesId> listaDetalleVariedadCuarteles() throws HibernateException{
        List<DetallevariedadcuartelesId> lista = null;
        try{
            iniciar();
            lista = session.createQuery("from DetallevariedadCuartelesId").list();
            
        }finally{
            session.close();
        }
         return lista;
    }   
public void MetodoGrabarDetalleVariedadCuartelesId(DetallevariedadcuartelesId objetoDetallevariedadcuartelesId)throws  HibernateException{
    try{
        iniciar();
        session.save(objetoDetallevariedadcuartelesId);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  } 
public void MetodoEliminarDetalleVariedadCuartelesId(DetallevariedadcuartelesId objetoDetallevariedadcuartelesId) throws  HibernateException{
    try{
        iniciar();
        session.delete(objetoDetallevariedadcuartelesId);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
public void MetodoActualizarDetalleVariedadCuartelesId(DetallevariedadcuartelesId objetoDetallevariedadcuartelesId)throws  HibernateException{
    try{
        iniciar();
        session.update(objetoDetallevariedadcuartelesId);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
 
}
