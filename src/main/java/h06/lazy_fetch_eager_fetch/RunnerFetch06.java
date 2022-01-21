package h06.lazy_fetch_eager_fetch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch06 {

	public static void main(String[] args) {
		
		
		Student06 std = new Student06();
		
		Book06 book = new Book06();
		
		
		//Lazy Fetch will only fetch necessary data
		//It will not occupy database with unnecessary data
		//When you make a lazy fetch, you will not consume more storage on your local
		
		//Eager fetch is just good when you need more data manipulation even related to child tables
		
		
		
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student06.class).
				addAnnotatedClass(Book06.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		
		Transaction tx = session.beginTransaction();
		
		
		std =session.get(Student06.class, 101);
		
		
		
		tx.commit();
		
		
		System.out.println(std);
		
	}

}
