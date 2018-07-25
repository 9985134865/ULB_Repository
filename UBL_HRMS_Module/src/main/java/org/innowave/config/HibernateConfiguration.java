package org.innowave.config;

import java.util.Properties;
import java.util.logging.Logger;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projections;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.service.internal.StandardServiceRegistryImpl;
import org.innowave.beans.EmployeeBean;

public class HibernateConfiguration {
	private static SessionFactory factory=null;
	//Logger logger=Logger.getLogger(HibernateConfiguration.class);
	private HibernateConfiguration() {
		System.out.println("HibernateConfiguration object is created");
	}
	
	public static SessionFactory getSessionFactory() {
		
		if(!(factory==null)) {
			return factory;
		}else {
			Configuration conf=new Configuration().configure("org/configs/hibernate/hibernate.cfg.xml");	
			ServiceRegistry serviceRegistry=new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();	
			return factory=conf.buildSessionFactory(serviceRegistry);
		}		
	}
}
