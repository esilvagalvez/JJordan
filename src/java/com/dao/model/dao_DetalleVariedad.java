package com.dao.model;

import com.pojos.model.Detallevariedadcuarteles;
import com.pojos.model.Detallevariedades;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class dao_DetalleVariedad {
         private Session session;
    private Transaction tran;
        
private void iniciar() throws HibernateException{
        session=HibernateUtil.getSessionFactory().openSession();
        tran=session.beginTransaction();
    }
public List<Detallevariedades> listaDetalleVariedades() throws HibernateException{
        List<Detallevariedades> lista = null;
        try{
            iniciar();
            lista = session.createQuery("from Detallevariedades").list();
            
        }finally{
            session.close();
        }
         return lista;
    }   
public void MetodoGrabarDetalleVariedades(Detallevariedades objetoDetallevariedades)throws  HibernateException{
    try{
        iniciar();
        session.save(objetoDetallevariedades);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  } 
public void MetodoEliminarDetalleVariedades(Detallevariedades objetoDetallevariedades) throws  HibernateException{
    try{
        iniciar();
        session.delete(objetoDetallevariedades);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
public void MetodoActualizarDetalleVariedades(Detallevariedades objetoDetallevariedades)throws  HibernateException{
    try{
        iniciar();
        session.update(objetoDetallevariedades);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
 
}
