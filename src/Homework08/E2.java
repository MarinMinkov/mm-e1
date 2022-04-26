package Homework08;

public class E2 {

    static class Employee
    {
        final int id;
        final String fName;
        final String lName;
        double salary;

        Employee(int id, String fName, String lName, double salary) {
            this.id = id;
            this.fName = fName;
            this.lName = lName;
            this.salary = salary;
        }


        public double getAnnualSalary()
        {
            return this.salary*12;
        }

        public double raiseSalary(double raisePercent)
        {
            this.salary += this.salary*raisePercent/100;
            return this.salary;
        }

        public String toString()
        {
            System.out.println(id);
            System.out.println(fName);
            System.out.println(lName);
            System.out.println(salary);
            return null;
        }

    }


    public static void main(String[] args) {

    }
}
