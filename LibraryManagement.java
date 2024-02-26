import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int id;
    private ArrayList<String> takenBooks;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.takenBooks = new ArrayList<>();
    }

    public void changeUser() {
        // Implement user role switching logic here
        System.out.println("User role changed to librarian.");
    }
}

class Librarian {
    private String name;
    private int id;

    public Librarian(String name, int id) {
        this.name = name;
        this.id = id;
    }

 

    public void changeUser() {
        // Implement user role switching logic here
        System.out.println("User role changed to student.");
    }
}

