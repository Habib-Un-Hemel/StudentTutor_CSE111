package Assignment2.homeWork.task4;

public class Employee {
    String name;
    String designation;
    double salary;

    // public Employee() {
    //     this.name = "Unknown";
    //     this.designation = "Employee";
    //     this.salary = 30000; // Default salary
    // }

    public void newEmployee(String name) {
        this.name = name;
        this.designation = "junior";
        this.salary = 30000; 
    }
    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary + "Tk");
        System.out.println("Employee Designation: " + designation);

    }
    public void promoteEmployee(String designation) {
        this.designation = designation;
        if (designation == "lead") {
            this.salary = salary+ 50000; 
            System.out.println(name + " promoted to Lead with salary");
        } else if (designation.equals("manager")) {
            this.salary = salary+ 70000; 
            System.out.println(name + " promoted to manager with salary");

        } else if (designation.equals("senior ")) {
            this.salary = salary+ 25000; 
            System.out.println(name + " promoted to senior with salary");

        } else {
            System.out.println("Invalid designation");
        }
    }
    public void calculateTax(){
        double tax = 0.0;
        if (salary <= 30000) {
            System.out.println("No need to pay tax");
        }
        if (salary > 50000) {
            tax = salary * 0.3; 
            System.out.println(name + " Tax amount: " + tax + "Tk");

        } else if (salary > 30000) {
            tax = salary * 0.1; 
        System.out.println(name + "Tax amount: " + tax + "Tk");

        }
    }
}
