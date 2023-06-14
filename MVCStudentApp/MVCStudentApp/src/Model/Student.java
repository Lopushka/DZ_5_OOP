package Model;

public class Student extends Person implements Comparable<Student> {
  private long studenrid;

  /**
   * конструктор
   * 
   * @param firstName  Имя
   * @param secondName Фамилия
   * @param age        возраст
   * @param studenrid  id
   */
  public Student(String firstName, String secondName, int age, long studenrid) {
    super(firstName, secondName, age);
    this.studenrid = studenrid;
  }

  public long getStudenrid() {
    return studenrid;
  }

  public void setStudenrid(long studenrid) {
    this.studenrid = studenrid;
  }

  @Override
  public String toString() {
    return "Student{" + "studenrid = " + studenrid + '\''
        + ", firstName = " + super.getFirstName() + '\'' +
        ", secondName = " + super.getSecondName() + '\'' +
        ", age = " + super.getAge()
        + "}";
  }

  /**
   * Перегрузка для сравнения
   */
  @Override
  public int compareTo(Student o) {
    System.out.println(super.getFirstName() + " - " + o.getFirstName());
    if (super.getAge() == o.getAge()) {
      if (this.studenrid == o.studenrid) {
        return 0;
      }
      if (this.studenrid < o.studenrid) {
        return -1;
      }
      return 1;
    }
    if (super.getAge() < o.getAge()) {
      return -1;
    }
    return 1;
  }

}
