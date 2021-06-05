package hibernate_one_to_many;


import hibernate_one_to_many.entity.Department;
import hibernate_one_to_many.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        Department dep = new Department("IT", 300, 1200);
        Employee emp1 = new Employee("Roma", "Yanin", 800);
        Employee emp2 = new Employee("Elena", "Smirnova", 1000);
        dep.addEmployeeToDepartment(emp1);
        dep.addEmployeeToDepartment(emp2);
        session.beginTransaction();
        /*
        session.save(dep);
        Insert
         */
        Employee employee = session.get(Employee.class, 2);
        session.delete(employee);
        session.getTransaction().commit();
        factory.close();
    }
}
