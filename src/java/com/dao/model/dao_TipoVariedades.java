package com.dao.model;

import com.pojos.model.Personas;
import com.pojos.model.Tipovariedad;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class dao_TipoVariedades {
   private Session session;
    private Transaction tran;
        
private void iniciar() throws HibernateException{
        session=HibernateUtil.getSessionFactory().openSession();
        tran=session.beginTransaction();
    }
public List<Tipovariedad> listaTipoVariedades() throws HibernateException{
        List<Tipovariedad> lista = null;
        try{
            iniciar();
            lista = session.createQuery("from TipoVariedad").list();
            
        }finally{
            session.close();
        }
         return lista;
    }   
public void MetodoGrabarTipoVariedades(Tipovariedad objetoTipovariedad)throws  HibernateException{
    try{
        iniciar();
        session.save(objetoTipovariedad);
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  } 
public void MetodoEliminarTipoVariedades(Tipovariedad objetoTipovariedad) throws  HibernateException{
    try{
        iniciar();
        session.delete(objetoTipovariedad);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
public void MetodoActualizarTipoVariedades(Tipovariedad objetoTipovariedad)throws  HibernateException{
    try{
        iniciar();
        session.update(objetoTipovariedad);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
   
}
