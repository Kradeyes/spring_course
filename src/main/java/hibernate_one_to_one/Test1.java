package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        Employee employee = new Employee("Roman","Yanin","IT",1000);
        Detail detail = new Detail("Moscow", "2091031", "email");
        employee.setEmpDetail(detail);
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();
        factory.close();
    }
}
