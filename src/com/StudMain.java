package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudMain {

	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session ses=factory.openSession();
		Address adr=new Address(440033,"Nagpur","MH");
		Student st=new Student(101,"Tushar",150,adr);
		ses.save(st);
		Transaction tx=ses.beginTransaction();
		tx.commit();
		System.out.println("Success");

	}

}
