import java.util.Objects;

public class Employee {
    private  String department;
    private  int uniqueNumber;
    private String surname;
    private String name;
    private String patronymic;
    private int salary;

    public Employee(String department, int uniqueNumber, String surname, String name, String patronymic, int salary) {
        this.department = department;
        this.uniqueNumber = uniqueNumber;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(int uniqueNumber) {
        this.uniqueNumber = uniqueNumber;
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
        return "Департамент: " + department +  ',' + " U№: " + uniqueNumber + "," + " ФИО: " + surname + "," + name + "," + patronymic + ", зарплата: " + salary + " руб.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return uniqueNumber == employee.uniqueNumber && salary == employee.salary && Objects.equals(department, employee.department) && Objects.equals(surname, employee.surname) && Objects.equals(name, employee.name) && Objects.equals(patronymic, employee.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(department, uniqueNumber, surname, name, patronymic, salary);
    }
}

