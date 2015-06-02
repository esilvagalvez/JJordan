package com.dao.model;

import com.pojos.model.Detallesubregion;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class dao_DetalleSubRegion {
     private Session session;
    private Transaction tran;
        
private void iniciar() throws HibernateException{
        session=HibernateUtil.getSessionFactory().openSession();
        tran=session.beginTransaction();
    }
public List<Detallesubregion> listaDetalleSubRegion() throws HibernateException{
        List<Detallesubregion> lista = null;
        try{
            iniciar();
            lista = session.createQuery("from DetalleSubRegion").list();
            
        }finally{
            session.close();
        }
         return lista;
    }   
public void MetodoGrabarDEtalleSubRegion(Detallesubregion objetoDetallesubregion)throws  HibernateException{
    try{
        iniciar();
        session.save(objetoDetallesubregion);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  } 
public void MetodoEliminarDetalleSubRegion(Detallesubregion objetoDetallesubregion) throws  HibernateException{
    try{
        iniciar();
        session.delete(objetoDetallesubregion);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
public void MetodoActualizarDetalleSubRegion(Detallesubregion objetoDetallesubregion)throws  HibernateException{
    try{
        iniciar();
        session.update(objetoDetallesubregion);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
}
