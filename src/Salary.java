public class Salary {

    public Name[] name = new Name[5];

    public double totalSum(Name[] name) {
        double sum = 0;
        for (int i = 0; i < name.length; i++) {
            if (name[i] != null) {
                sum += name[i].getSalary();
            }
        }
        return sum;
    }

    public double maxSalary(Name[] name) {
        int max = 0;
        for (int i = 0; i < name.length; i++) {
            if (name[i] != null) {

                if (max < name[i].getSalary()) {
                    max = name[i].getSalary();
                }
            }
        }
        return max;
    }

    public double minSalary(Name[] name) {
        int min = 95000;
        for (int i = 0; i < name.length; i++) {
            if (name[i] != null) {

                if (min > name[i].getSalary()) {
                    min = name[i].getSalary();
                }
            }
        }
        return min;
    }

    public double averageSum(Name[] name) {
        double sum = 0;
        double averageSum = 0;
                for (int i = 0; i < name.length; i++) {
            if (name[i] != null) {
                sum += name[i].getSalary();
                averageSum = sum / 5;
            }
        }
        return averageSum;
    }
    }





