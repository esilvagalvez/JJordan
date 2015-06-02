package com.dao.model;


import com.pojos.model.Detallevariedadcuarteles;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class dao_DetalleVariedadCuarteles {
    
     private Session session;
    private Transaction tran;
        
private void iniciar() throws HibernateException{
        session=HibernateUtil.getSessionFactory().openSession();
        tran=session.beginTransaction();
    }
public List<Detallevariedadcuarteles> listaDetalleVariedadCuarteles() throws HibernateException{
        List<Detallevariedadcuarteles> lista = null;
        try{
            iniciar();
            lista = session.createQuery("from DetallevariedadCuarteles").list();
            
        }finally{
            session.close();
        }
         return lista;
    }   
public void MetodoGrabarDetalleVariedadCuarteles(Detallevariedadcuarteles objetoDetallevariedadcuarteles)throws  HibernateException{
    try{
        iniciar();
        session.save(objetoDetallevariedadcuarteles);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  } 
public void MetodoEliminarDetalleVariedadCuarteles(Detallevariedadcuarteles objetoDetallevariedadcuarteles) throws  HibernateException{
    try{
        iniciar();
        session.delete(objetoDetallevariedadcuarteles);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
public void MetodoActualizarDetalleVariedadCuarteles(Detallevariedadcuarteles objetoDetallevariedadcuarteles)throws  HibernateException{
    try{
        iniciar();
        session.update(objetoDetallevariedadcuarteles);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
   
}
