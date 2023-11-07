package db;

import java.utili.Hashmap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSource;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.dao.Student;

public class HibernateDatabaseConnection {
	private static StndardServiceRegistry registry;
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null)
		{
			try {
				StandardServiceRegisterBuilder registeryBuilder = 
						new StandardServiceRegisteryBuilder();
				
				
				Map settings = new HashMap<>();				
			}catch(Esception e)
			{
				
			}
		}
	}
	
	
	
	
	
}
