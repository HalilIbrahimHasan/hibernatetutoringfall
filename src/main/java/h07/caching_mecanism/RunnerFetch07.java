package h07.caching_mecanism;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch07 {

	public static void main(String[] args) {
		

		Book07 book = new Book07();
		
		Student07 std =new Student07();
		

		Configuration con = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student07.class).
				addAnnotatedClass(Book07.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		
		Transaction tx = session.beginTransaction();
		
		std = session.get(Student07.class, 101);
		book = session.get(Book07.class, 10);
		
		book = session.get(Book07.class, 11);

		book = session.get(Book07.class, 10);

		

		
		tx.commit();
		session.close();
		
		System.out.println(book);
		

		
		
	}

}
