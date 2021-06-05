package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;
        try {
        /* session = factory.getCurrentSession();
         Section section1 = new Section("Football");
         Child child1 = new Child("Roma", 5);
            Child child2 = new Child("Masha", 6);
            Child child3 = new Child("Sasha", 7);
            section1.addChildToSection(child1);
            section1.addChildToSection(child2);
            section1.addChildToSection(child3);

            session.beginTransaction();

            session.persist(section1);

            session.getTransaction().commit();
            System.out.println("Done");
            addChildToSection
         */
            //*************************************
         /*
            session = factory.getCurrentSession();
            Section section1 = new Section("Volleyball");
            Section section2 = new Section("Chess");
            Section section3 = new Section("Math");
            Child child1 = new Child("Igor", 10);
            child1.addSectionToChild(section1);
            child1.addSectionToChild(section2);
            child1.addSectionToChild(section3);

            session.beginTransaction();

            session.persist(child1);

            session.getTransaction().commit();
            System.out.println("Done");
            addSectionToChild
         */
            //*************************************
            /*
            session = factory.getCurrentSession();
            session.beginTransaction();
            Section section = session.get(Section.class,1);
            System.out.println(section);
            System.out.println(section.getChildList());

            Child child = session.get(Child.class, 4);
            System.out.println(child);
            System.out.println(child.getSectionList());

            session.getTransaction().commit();
            System.out.println("Done");
            Get info
             */
            session = factory.getCurrentSession();
            session.beginTransaction();
            Section section = session.get(Section.class, 4);
            session.delete(section);

            session.getTransaction().commit();
            System.out.println("Done");
        }
        finally {
         session.close();
         factory.close();
        }
    }
}
