package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        //Employee emp = session.get(Employee.class, 2);
        //session.delete(emp);
        session.createQuery("delete Employee where name='Ivan'").executeUpdate();
        session.getTransaction().commit();
        factory.close();
    }
}
