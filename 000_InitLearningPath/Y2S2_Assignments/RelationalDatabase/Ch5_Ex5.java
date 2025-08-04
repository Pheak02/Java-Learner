package RelationalDatabase;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collection;

public class Ch5_Ex5 {

}

class Course {
    private String name;
    private String lecturerName;
    private int ID;

    Course(int ID, String name, String lecturerName) {
        this.ID = ID;
        this.name = name;
        this.lecturerName = lecturerName;
    }

    // GETTER METHOD
    public int getcourseID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getLecturer() {
        return lecturerName;
    }

    public String toString() {
        return ID + " " + name + " " + lecturerName;
    }

}

class CRUDOperation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int option;
        do {
            System.out.println("1. Insert new course:");
            System.out.println("2. Display the courses:");
            System.out.println("3. Search the course:");
            System.out.println("4. Delete the course:");
            System.out.println("5. Update the course:");
            System.out.print("6. Enter your choice:");
            option = s.nextInt();

            switch (option) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        } while (option != 0);

    }
}