/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package part_b;

import java.util.ArrayList;
import java.util.List;

import part_a.*;

public class App {

    public App(){
        List<Student> students = new ArrayList<>();
        // List<Student> students = new ArrayList<>();

        Student s = new Student("Mark", 21, "11/09/2022", 4);

        System.out.println(s.getUsername());

        
    }

    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App());
    }
}
