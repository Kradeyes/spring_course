package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        Employee employee = new Employee("Yura","Ivanov","HR",500);
        Detail detail = new Detail("Moscow", "223423523", "email");
        employee.setEmpDetail(detail);
        detail.setEmployee(employee);
        session.beginTransaction();
        session.save(detail);
        session.getTransaction().commit();
        factory.close();
    }
}
