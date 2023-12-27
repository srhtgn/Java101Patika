import java.util.Calendar;
class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary <= 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        if (workHours > 40) {
            int extraHours = workHours - 40;
            return extraHours * 30;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int yearsWorked = currentYear - hireYear;

        double raiseAmount = 0;

        if (yearsWorked < 10) {
            raiseAmount = salary * 0.05;
        } else if ((yearsWorked < 20) && (yearsWorked > 9)) {
            raiseAmount = salary * 0.1;
        } else {
            raiseAmount = salary * 0.15;
        }

        return raiseAmount;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    @Override
    public String toString() {
        return "Adı: " + name +
                "\nMaaşı: " + salary +
                "\nÇalışma Saati: " + workHours +
                "\nBaşlangıç Yılı: " + hireYear;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("kemal", 2000.0, 45, 1985);

        double tax = employee.tax();
        double bonus = employee.bonus();
        double raiseAmount = employee.raiseSalary();

        double totalSalaryWithBonusTax = employee.getSalary() + bonus - tax;
        double totalSalary = employee.getSalary() + raiseAmount + bonus - tax;

        System.out.println(employee);
        System.out.println("Vergi: " + tax);
        System.out.println("Bonus: " + bonus);
        System.out.println("Maaş Artışı: " + raiseAmount);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + totalSalaryWithBonusTax);
        System.out.println("Toplam Maaş: " + (totalSalary));
    }
}
