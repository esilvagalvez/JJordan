package com.dao.model;

import com.pojos.model.Personas;
import com.pojos.model.Tipousuarios;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class dao_TipoUsuarios {
     private Session session;
    private Transaction tran;
        
private void iniciar() throws HibernateException{
        session=HibernateUtil.getSessionFactory().openSession();
        tran=session.beginTransaction();
    }
public List<Tipousuarios> listaTipousuarios() throws HibernateException{
        List<Tipousuarios> lista = null;
        try{
            iniciar();
            lista = session.createQuery("from Tipousuarios").list();
            
        }finally{
            session.close();
        }
         return lista;
    }   
public void MetodoGrabarTipoUsuarios(Tipousuarios objetoTipousuarios)throws  HibernateException{
    try{
        iniciar();
        session.save(objetoTipousuarios);
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  } 
public void MetodoEliminarTipoUsuarios(Tipousuarios objetoTipousuarios) throws  HibernateException{
    try{
        iniciar();
        session.delete(objetoTipousuarios);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
public void MetodoActualizarTipoUsuraios(Tipousuarios objetoTipousuarios)throws  HibernateException{
    try{
        iniciar();
        session.update(objetoTipousuarios);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
 
}
