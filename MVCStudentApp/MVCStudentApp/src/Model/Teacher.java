package Model;

public class Teacher extends Person {
    private int teacherid;
    private String acadeDegree;

    /**
     * конструктор
     * 
     * @param firstName   Имя
     * @param secondName  Фамилия
     * @param age         возраст
     * @param teacherid   id
     * @param acadeDegree степень
     */
    public Teacher(String firstName, String secondName, int age, int teacherid, String acadeDegree) {
        super(firstName, secondName, age);
        this.teacherid = teacherid;
        this.acadeDegree = acadeDegree;
    }

    public int getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }

    public String getAcadeDegree() {
        return acadeDegree;
    }

    public void setAcadeDegree(String acadeDegree) {
        this.acadeDegree = acadeDegree;
    }

    @Override
    public String toString() {
        return "Teacher{" + "teacherid = " + teacherid + '\'' + ", acadeDegree = "
                + acadeDegree + '\'' + ", firstName = " + super.getFirstName() + '\'' +
                ", secondName = " + super.getSecondName() + '\'' +
                ", age = " + super.getAge() + "}";
    }

}