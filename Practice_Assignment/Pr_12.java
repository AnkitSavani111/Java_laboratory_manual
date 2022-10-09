/*       
    Create an Association class that encapsulates two objects of different types. Similar
    to Exercise above, create a Transition class that does the same of Association class
*/

// Ankit Savani (21CE122)

class IT {

    private String name;

    // Constructor of this class
    IT(String name) {

        this.name = name;
    }

    // Method of IT class
    public String getITName() {
        // Returning name of IT
        return this.name;
    }
}

class Employee {
    // Attributes of employee
    private String name;

    // Employee name
    Employee(String name) {
        // This keyword refers to current instance itself
        this.name = name;
    }

    // Method of Employee class
    public String getEmployeeName() {
        // returning the name of employee
        return this.name;
    }
}

public class Pr_12 {

    // Main driver method
    public static void main(String[] args) {

        // Creating objects of IT and Employee class
        IT it = new IT("TCS");
        Employee emp = new Employee("Ankit Savani");
        System.out.println(emp.getEmployeeName() + " is employee of " + it.getITName());
    }
}