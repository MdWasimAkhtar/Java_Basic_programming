package helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class FactoryProvider {
	
	public static SessionFactory sesfactory;
	
	public static SessionFactory getFactory() {
		if(sesfactory == null) {
			sesfactory = new   Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return sesfactory;
	}
	
	
	
	public void closeFactory() {
		
		if(sesfactory.isOpen())
			sesfactory.close();
	}

}
