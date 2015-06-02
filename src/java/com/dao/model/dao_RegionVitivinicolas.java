
package com.dao.model;


import com.pojos.model.Regionvitivinicolas;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class dao_RegionVitivinicolas {
 private Session session;
    private Transaction tran;
        
private void iniciar() throws HibernateException{
        session=HibernateUtil.getSessionFactory().openSession();
        tran=session.beginTransaction();
    }
public List<Regionvitivinicolas> listaRegionVitivinicolas() throws HibernateException{
        List<Regionvitivinicolas> lista = null;
        try{
            iniciar();
            lista = session.createQuery("from RegionVitivinicolas").list();
            
        }finally{
            session.close();
        }
         return lista;
    }   
public void MetodoGrabarRegionVitivinicolas(Regionvitivinicolas objetoRegionvitivinicolas)throws  HibernateException{
    try{
        iniciar();
        session.save(objetoRegionvitivinicolas);
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  } 
public void MetodoEliminarRegionVitivinicolas(Regionvitivinicolas objetoRegionvitivinicolas) throws  HibernateException{
    try{
        iniciar();
        session.delete(objetoRegionvitivinicolas);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
public void MetodoActualizarRegionVitivinicolas(Regionvitivinicolas objetoRegionvitivinicolas)throws  HibernateException{
    try{
        iniciar();
        session.update(objetoRegionvitivinicolas);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
     
}
