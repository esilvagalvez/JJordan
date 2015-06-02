package com.dao.model;

import com.pojos.model.Bancoentidades;
import com.pojos.model.BancoentidadesId;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class dao_BancoentidadesId {
        private Session session;
    private Transaction tran;
    // metodo par ainicializar sesion y trasacción 
    
private void iniciar() throws HibernateException{
        session=HibernateUtil.getSessionFactory().openSession();
        tran=session.beginTransaction();
    }
public List<BancoentidadesId> listaBancoEntidadesIDNumeroCuenta() throws HibernateException{
        List<BancoentidadesId> lista = null;
        try{
            iniciar();
            lista = session.createQuery("from BancoentidadesId").list();
            
        }finally{
            session.close();
        }
         return lista;
    }   
public void MetodoGrabarBancoEntidadesIDNumeroCuenta(BancoentidadesId objetoBancoentidadesId)throws  HibernateException{
    try{
        iniciar();
        session.save(objetoBancoentidadesId);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  } 
public void MetodoEliminarBancoEntidadesIdNumeroCuenta(BancoentidadesId objetoBancoentidadesId)throws  HibernateException{
    try{
        iniciar();
        session.delete(objetoBancoentidadesId);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
public void MetodoActualizarBancoentidadesIdNumeroCuenta(BancoentidadesId objetoBancoentidadesId)throws  HibernateException{
    try{
        iniciar();
        session.update(objetoBancoentidadesId);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
}
