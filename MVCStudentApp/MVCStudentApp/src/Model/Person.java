package Model;

public class Person {
    private String firstName;
    private String secondName;
    private int age;

    /**
     * конструктор
     * 
     * @param firstName  имя
     * @param secondName фамилия
     * @param age        возраст
     */
    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    /* получение имени */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /* получение фамилии */
    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /* получение возраста */
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "user{" + "firstName = " + firstName + '\'' +
                ", secondName = " + secondName + '\'' +
                ", age = " + age +
                "}";
    }

}
