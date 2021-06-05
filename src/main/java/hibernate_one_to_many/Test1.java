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
        Department dep = new Department("Sales", 800, 1500);
        Employee emp1 = new Employee("Ivan", "Ivanov", 800);
        Employee emp2 = new Employee("Maria", "Egorova", 1500);
        Employee emp3 = new Employee("Anton", "Sidorov", 1200);
        dep.addEmployeeToDepartment(emp1);
        dep.addEmployeeToDepartment(emp2);
        dep.addEmployeeToDepartment(emp3);
        session.beginTransaction();

        System.out.println("Get department");
        Department department = session.get(Department.class, 3);

        System.out.println("Show department");
        System.out.println(department);

        System.out.println("Show employees of the department");
        System.out.println(department.getEmps());

        /*
        session.save(dep);
        Insert
         */

        /*
        Department employee = session.get(Department.class, 3);
        session.delete(employee);
        Delete
         */
        session.getTransaction().commit();
        factory.close();
    }
}
