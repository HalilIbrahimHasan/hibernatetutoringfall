package h04.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch04 {

	public static void main(String[] args) {
		Book04 bookReader = new Book04();
		Student04 std = new Student04();

		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student04.class)
				.addAnnotatedClass(Book04.class);

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		bookReader = session.get(Book04.class, 10);

		std = session.get(Student04.class, 102);

		tx.commit();
		
		System.out.println(std);

	}

}
