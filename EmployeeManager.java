class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    void displayManagerInfo() {
        displayInfo();
        System.out.println("Department: " + department);
    }
}

public class EmployeeManager {
    public static void main(String[] args) {
        Manager m = new Manager("Navami", 50000, "IT");
        m.displayManagerInfo();
    }
}
