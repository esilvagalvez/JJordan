package com.dao.model;

import com.pojos.model.Bancoentidades;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class dao_Bancoentidades {
    
    private Session session;
    private Transaction tran;
    // metodo par ainicializar sesion y trasacción 
    
private void iniciar() throws HibernateException{
        session=HibernateUtil.getSessionFactory().openSession();
        tran=session.beginTransaction();
    }

public List<Bancoentidades> listaAreas() throws HibernateException{
        List<Bancoentidades> lista = null;
        try{
            iniciar();
            lista = session.createQuery("from Bancoentidades").list();
            
        }finally{
            session.close();
        }
         return lista;
    }       

public void MetodoGrabarBancoEntidades(Bancoentidades objetoBancoentidades)throws  HibernateException{
    try{
        iniciar();
        session.save(objetoBancoentidades);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  } 
    
public void MetodoBancoEntidades(Bancoentidades objetoBancoentidades)throws  HibernateException{
    try{
        iniciar();
        session.delete(objetoBancoentidades);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }

public void MetodoActualizarBancoentidades(Bancoentidades objetoBancoentidades)throws  HibernateException{
    try{
        iniciar();
        session.update(objetoBancoentidades);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }

}
