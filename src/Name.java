import java.util.Objects;

public class Name {
    private String surname;
    private String name;
    private String patronymic;
    private int salary;

    public Name(String surname, String name, String patronymic, int salary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.salary = salary;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ФИО: " + surname + "," + name + "," + patronymic + ", зарплата: " + salary + " руб.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name1 = (Name) o;
        return Objects.equals(surname, name1.surname) && Objects.equals(name, name1.name) && Objects.equals(patronymic, name1.patronymic) && Objects.equals(salary, name1.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, patronymic, salary);
    }
}
