package Controller;

import java.util.List;

import Model.Student;

/** Интерфейс */
public interface iGetView {
    void prinAllStudent(List<Student> students);

    String prompt(String message);
}
