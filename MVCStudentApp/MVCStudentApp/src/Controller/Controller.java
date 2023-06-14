package Controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.*;

import View.*;

//**Контролер  */
public class Controller {
    /**Список  */
    private List<Student> students;
    /**интерфейс view */
    private iGetView view;
    /** интерфейс model */
    private iGetModel model;
    /**
     * Конструторк 
     * @param view интерфейс view
     * @param model интерфейс model
     */
    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();
    }
    /**Принимает всех студентов  */
    public void getAllStudent(){
        students = model.getAllStudent();
    }
    /**
     * удаления студента 
     * @param id
     */
    public void DTLstg(Long id){
        model.DTLstg(id);
    }
    /**
     * Проверка на наличие студентов в списке
     * @return false - если список пуст
     */
    public boolean testData (){
        if (students.size() > 0) {
            return true;
        }
        else {
            return false;
        }
    }
    /**Обновление Вида */
    public void updateView(){
        getAllStudent();
        if (testData()) {
            view.prinAllStudent(students);
        }
        else {
            System.out.println("Список студентов пуст!");
        }


        //MVC
        //view.printAllStudent(model.getAllStudent());
    }
    /** Метод вызова команд для пользователя */
    public void run(){
        Commands com = Commands.NONE;
        Boolean getNewIteration = true;
        while (getNewIteration) {
            String command = view.prompt("Введите команду!");
            com = Commands.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                getNewIteration = false;
                System.out.println("Выход из программы");
                    break;
                case LIST:
                getAllStudent();
                updateView();
                    break;
                case DELETE:
                String dlt = view.prompt("Введите номер студента, которого хотите удалить");
                Long id = Long.parseLong(dlt);
                DTLstg(id);

                    break;
                default:
                    break;
            }
        }
    }
}
