package com.dao.model;

import com.pojos.model.Variedades;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class dao_Variedades {
   private Session session;
    private Transaction tran;
        
private void iniciar() throws HibernateException{
        session=HibernateUtil.getSessionFactory().openSession();
        tran=session.beginTransaction();
    }
public List<Variedades> listaVariedades() throws HibernateException{
        List<Variedades> lista = null;
        try{
            iniciar();
            lista = session.createQuery("from Variedades").list();
            
        }finally{
            session.close();
        }
         return lista;
    }   
public void MetodoGrabarVariedades(Variedades objetoVariedades)throws  HibernateException{
    try{
        iniciar();
        session.save(objetoVariedades);
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  } 
public void MetodoEliminarVariedades(Variedades objetoVariedades) throws  HibernateException{
    try{
        iniciar();
        session.delete(objetoVariedades);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
public void MetodoActualizarVariedades(Variedades objetoVariedades)throws  HibernateException{
    try{
        iniciar();
        session.update(objetoVariedades);
        tran.commit();
                
    }catch(Exception e){
          tran.rollback();
        
    }finally{
        session.close();
    }
  }
   
}
