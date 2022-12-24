public class Main {
    public static void main(String[] args) {
        Salary salary = new Salary();
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("ДКС", 1, "Иванов", "Иван", "Иванович", 55000);
        employee[1] = new Employee("ДКС", 2,"Семенов", "Семен", "Семенович", 65000);
        employee[2] = new Employee("ДКС", 3,"Александров", "Алесандр", "Александрович", 45000);
        employee[3] = new Employee("ДКС", 4,"Петров", "Петр", "Петрович", 75000);
        employee[4] = new Employee("ДКС", 5,"Борисов", "Борис", "Борисович", 95000);
        for (Employee i : employee) {
            System.out.println(i);

        }

        {
            System.out.println("Общая сумма затрат на зарплаты сотрудникам: " + salary.totalSum(employee) + " руб.");
        }
        {
            System.out.println("Максимальная зарплата: " + salary.maxSalary(employee) + " руб.");
        }
        {
            System.out.println("Минимальная зарплата: " + salary.minSalary(employee) + " руб.");
        }
        {
            System.out.println("Средняя зарплата: " + salary.averageSum(employee) + " руб.");
        }

    }
}