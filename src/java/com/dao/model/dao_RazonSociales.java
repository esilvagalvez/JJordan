package com.dao.model;

import com.pojos.model.Razonsociales;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class dao_RazonSociales {
  private Session session;
  private Transaction tran;
        
private void iniciar() throws HibernateException{
        session=HibernateUtil.getSessionFactory().openSession();
        tran=session.beginTransaction();
    }
public List<Razonsociales> listaRazonSociales() throws HibernateException{
        List<Razonsociales> lista = null;
        try{
            iniciar();
            lista = session.createQuery("from Razonsociales").list();
            
        }finally{
            session.close();
        }
         return lista;
    }   
public void MetodoGrabarRazonSociales(Razonsociales objetoRazonsociales)throws  HibernateException{
    try{
        iniciar();
        session.save(objetoRazonsociales);
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  } 
public void MetodoEliminarRazonSociales(Razonsociales objetoRazonsociales) throws  HibernateException{
    try{
        iniciar();
        session.delete(objetoRazonsociales);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
public void MetodoActualizarRazonSociales(Razonsociales objetoRazonsociales)throws  HibernateException{
    try{
        iniciar();
        session.update(objetoRazonsociales);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
    
}
