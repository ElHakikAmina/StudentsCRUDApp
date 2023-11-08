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
				settings.put("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
				settings.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/crudapp");
				settings.put("hibernate.connection.username", "root");
				settings.put("hibernate.connection.password", "1234");
				settings.put("hibernate.show_sql", "true");
				settings.put("hibernate.hdm2.auto","update");
				
				registryBuiler.applySettings(settings);
				
				registry = registryBuilder.build();
				
				Metadata metadata = sources.getMetadataBuilder().build();
				
				sessionFactory = metadata.getSessionFactoryBuilder().build();
			}catch(Esception e)
			{
				System.out.println("SessionFactory creation failed");
				if(registry != null) {
					StandardServiceRegistryBuilder.destroy(registry);
				}
			}
		}
		return sessionFactory;
	}
	public statis void shutdown() {
		if(regidtry != null)
		{
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}
	}
	
	
	
	
	
}
