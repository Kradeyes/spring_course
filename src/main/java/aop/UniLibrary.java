package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("We took the book from UniLibrary");
    }

    public void getMagazine() {
        System.out.println("We took the magazine from UniLibrary");
    }

    public String returnBook() {
        int  a = 10/0;
        System.out.println("We returned the book from UniLibrary");
        return "War and peace";
    }

    public void returnMagazine() {
        System.out.println("We took the magazine from UniLibrary");
    }

    public void addBook() {
        System.out.println("We added the book from UniLibrary");
    }

    public void addMagazine() {
        System.out.println("We added the magazine from UniLibrary");
    }
}
