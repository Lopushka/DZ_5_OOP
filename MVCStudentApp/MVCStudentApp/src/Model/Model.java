package Model;

import java.util.List;

import Controller.iGetModel;

public class Model implements iGetModel {
        /** Список студентов */
    private List<Student> students;

    /**
     * Конструктор Модели
     * 
     * @param students список студентов
     */
    public Model(List<Student> students) {
        this.students = students;
    }

    /** Метод получения списка всех студентов */
    public List<Student> getAllStudent() {
        return students;
    }

    /** Метод удаления студента из списка по идентификатору студента */
    @Override
    public void DTLstg(Long id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudenrid() == id) {
                students.remove(i);
            }
        }
    }

}
