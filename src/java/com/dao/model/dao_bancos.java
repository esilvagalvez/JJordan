package com.dao.model;

import com.pojos.model.Bancos;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class dao_bancos {
    
    private Session session;
    private Transaction tran;
        
private void iniciar() throws HibernateException{
        session=HibernateUtil.getSessionFactory().openSession();
        tran=session.beginTransaction();
    }
public List<Bancos> listaBancos() throws HibernateException{
        List<Bancos> lista = null;
        try{
            iniciar();
            lista = session.createQuery("from Bancos").list();
            
        }finally{
            session.close();
        }
         return lista;
    }   
public void MetodoGrabarBancos(Bancos objetobancos)throws  HibernateException{
    try{
        iniciar();
        session.save(objetobancos);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  } 
public void MetodoEliminarBancos(Bancos objetoBancos) throws  HibernateException{
    try{
        iniciar();
        session.delete(objetoBancos);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
public void MetodoActualizarBancos(Bancos objetoBancos)throws  HibernateException{
    try{
        iniciar();
        session.update(objetoBancos);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
}
    

