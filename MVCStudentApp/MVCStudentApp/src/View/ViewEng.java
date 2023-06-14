package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

/** Аглийском языке */
public class ViewEng implements iGetView {
    /**
     * Печать студентов
     * 
     * @param List<Student> students - список
     * 
     */
    public void prinAllStudent(List<Student> students) {
        System.out.println("-----List of students!-----");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("---------End !-----");
    }

    /** Чтение из консоли */
    @Override
    public String prompt(String message) {
        Scanner iscanner = new Scanner(System.in);
        System.out.println(message);
        return iscanner.nextLine();
    }

}
