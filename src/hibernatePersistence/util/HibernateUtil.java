package hibernatePersistence.util;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	 private static final SessionFactory sessionFactory = buildSessionFactory();
	    
	  private static SessionFactory buildSessionFactory(){     
	         
	         Configuration cfg = new Configuration();
	         cfg.configure("hibernate.cfg.xml");
	         return cfg.buildSessionFactory();
	      
	    } 
	    
	    public static SessionFactory getSessionFactory(){
	         return sessionFactory;
	  }
}
