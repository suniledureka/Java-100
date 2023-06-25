package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.hibernate.entity.Product;
import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class SaveProduct {

	public static void main(String[] args) {
				
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Product prod = new Product();
		prod.setProductId(10012);
		prod.setProductName("Mobile Phone");
		prod.setProductPrice(68750.50f);
		
		session.save(prod);		
		
		tx.commit();
		System.out.println("Product Saved!!");
		
		session.close();
		sfactory.close();
	}
}