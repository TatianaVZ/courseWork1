public class Salary {

    public Employee[] employee = new Employee[5];


    public double totalSum(Employee[] employee) {
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                sum += employee[i].getSalary();
            }
        }
        return sum;
    }

    public double maxSalary(Employee[] employee) {
        int max = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {

                if (max < employee[i].getSalary()) {
                    max = employee[i].getSalary();
                }
            }
        }
        return max;
    }

    public double minSalary(Employee[] employee) {
        int min = 95000;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {

                if (min > employee[i].getSalary()) {
                    min = employee[i].getSalary();
                }
            }
        }
        return min;
    }

    public double averageSum(Employee[] employee) {
        double sum = 0;
        double averageSum = 0;

        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                sum += employee[i].getSalary();
                averageSum = sum / i;
            }
        }
        return averageSum;
    }
}





