package com.control;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.to.Player;

public class HibernateMain 
{

	public static void main(String[] args) 
	{
		try {
		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(com.to.Player.class);
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
	//	Player p1 = new Player(4,"Banku","India", 2	); 
	//	Player p2 = new Player(6,"BharatBhai","Heaven", 68); 
	//  session.save(p1);
	//	session.save(p2);
		
		
		
	//	Player p = session.get(Player.class, 6);
	//  System.out.println("The Details : "+p);
	//  session.delete(p);
	
		Player p1 = new Player("Banku","Bapunagar", 2	); 
		Player p2 = new Player("BharatBhai","Heaven", 68); 
		Player p2 = new Player("TaraBen","Indai", 68); 
		Player p2 = new Player("BharatBhai","Heaven", 68); 
		Player p2 = new Player("BharatBhai","Heaven", 68); 
		session.save(p1);
		session.save(p2);	
		
		transaction.commit();
		session.close();
	
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
