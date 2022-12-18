public class Main {
    public static void main(String[] args) {
        Salary salary = new Salary();
        Name[] name = new Name[5];
        name[0] = new Name("Иванов", "Иван", "Иванович", 55000);
        name[1] = new Name("Семенов", "Семен", "Семенович", 65000);
        name[2] = new Name("Александров", "Алесандр", "Александрович", 45000);
        name[3] = new Name("Петров", "Петр", "Петрович", 75000);
        name[4] = new Name("Борисов", "Борис", "Борисович", 95000);
        for (Name i : name) {
            System.out.println(i);}

        { System.out.println("Общая сумма затрат на зарплаты сотрудникам: " + salary.totalSum(name) + " руб.");}
        { System.out.println("Максимальная зарплата: " + salary.maxSalary(name) + " руб.");}
        { System.out.println("Минимальная зарплата: " + salary.minSalary(name) + " руб.");}
        { System.out.println("Средняя зарплата: " + salary.averageSum(name) + " руб.");}

    }
    }