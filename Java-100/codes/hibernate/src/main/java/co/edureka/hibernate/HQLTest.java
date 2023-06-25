package co.edureka.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class HQLTest {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		
		/*
		//String hql = "from co.edureka.hibernate.entity.Student";
		//String hql = "from co.edureka.hibernate.entity.Student where studentName='Kupendra'";
		//String hql = "from co.edureka.hibernate.entity.Student where studentName LIKE 'S%'";
		String hql = "from co.edureka.hibernate.entity.Student where studentId IN (102,104,205,107,110,260)";
		Query<Student> q = session.createQuery(hql, Student.class);
		*/
		
		/*
		String hql = "from co.edureka.hibernate.entity.Student where studentId between ?1 and ?2"; //positional parameters		
		Query<Student> q = session.createQuery(hql, Student.class);
		q.setParameter(1, 101);
		q.setParameter(2, 106);
		*/
		
		String hql = "from co.edureka.hibernate.entity.Student where studentId between :minsid and :maxsid"; //named parameters		
		Query<Student> q = session.createQuery(hql, Student.class);
		q.setParameter("minsid", 105);
		q.setParameter("maxsid", 220);
		
		List<Student> students = q.getResultList();		
		printStudents(students);
		System.out.println();
		
		hql = "update co.edureka.hibernate.entity.Student set studentName='Sunil Joseph', studentEmail='sunil@edureka.co' where studentId=113";
		Query upQuery = session.createQuery(hql);
		
		session.beginTransaction();
		int rowsUpdated = upQuery.executeUpdate();
		System.out.println("students updated = " + rowsUpdated);
		session.getTransaction().commit();
		
		session.close();
		sfactory.close();

	}

	private static void printStudents(List<Student> students) {
		for(Student st : students) {
		 try {	
			System.out.println(st);
			Thread.sleep(1000);
		 }catch(Exception ex) {}
		}
	}

}
