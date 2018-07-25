package org.innowave.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.innowave.config.HibernateConfiguration;

public class Client_App {

	public static void main(String[] args) {
		/*Logger logger=Logger.getLogger("Client_App");
		logger.info("Execution started");*/
		SessionFactory factory=HibernateConfiguration.getSessionFactory();
		Session session=factory.openSession();
		EmployeeBean ebean=new EmployeeBean();
		ebean.setEmpl_Id(101);
		ebean.setEmpl_Name("Jeevan");
		ebean.setEmpl_Add("DMM");
		EmployeeBean ebean1=new EmployeeBean();
		ebean.setEmpl_Id(102);
		ebean.setEmpl_Name("Jeevan1");
		ebean.setEmpl_Add("DMMM");
		List<EmployeeBean> list=new ArrayList<EmployeeBean>();
		list.add(ebean);
		list.add(ebean1);
		Transaction tx=session.beginTransaction();
		for(EmployeeBean ebean2:list) {
			
		Serializable insertedRecord=session.save(ebean2);
		System.out.println(insertedRecord);
		}
		
		tx.commit();
		session.close();
	}
}
