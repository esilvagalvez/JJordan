package com.dao.model;



import com.pojos.model.Conduccionsistemas;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class dao_Conduccionsistemas {
  private Session session;
    private Transaction tran;
        
private void iniciar() throws HibernateException{
        session=HibernateUtil.getSessionFactory().openSession();
        tran=session.beginTransaction();
    }
public List<Conduccionsistemas> listaConduccionsistemas() throws HibernateException{
        List<Conduccionsistemas> lista = null;
        try{
            iniciar();
            lista = session.createQuery("from Conduccionsistemas").list();
            
        }finally{
            session.close();
        }
         return lista;
    }   
public void MetodoGrabarConduccionsistemas(Conduccionsistemas objetoConduccionsistemas)throws  HibernateException{
    try{
        iniciar();
        session.save(objetoConduccionsistemas);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  } 
public void MetodoEliminarConduccionsistemas(Conduccionsistemas objetoConduccionsistemas) throws  HibernateException{
    try{
        iniciar();
        session.delete(objetoConduccionsistemas);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
public void MetodoActualizarConduccionsistemas(Conduccionsistemas objetoConduccionsistemas)throws  HibernateException{
    try{
        iniciar();
        session.update(objetoConduccionsistemas);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }   
}
