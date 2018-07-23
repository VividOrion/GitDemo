package com.orion.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




//code by ninad
public class HibernateUtil {
	private static SessionFactory sf=null;
	public static SessionFactory getFactory()
	{
			if(sf==null)
			{
				sf=new Configuration().configure().buildSessionFactory();
			}
			return sf;
		}
		public static void flushNCommit(Session se,Transaction tr)
		{
			if(se!=null)
			{
				se.flush();
			}
			if(tr!=null)
			{
				tr.commit();
			}
		}
		public static void sessionClose(Session se)
		{
			if(se!=null)
			{
				se.close();
			}
			
		}
	}

