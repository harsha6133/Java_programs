import java.util.*;

class Employee implements Comparable<Employee> {
    String name;
    double salary;

    Employee(String name, double salary) {
        int count=0;
        System.out.println(count++);
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) {
        // Compare salaries first
        
        System.out.println("this object :"+this.name);
        System.out.println("Other object :"+other.name);
        if (this.salary != other.salary) {
            return Double.compare(this.salary, other.salary); // ascending order
        }
        
        // If salaries are equal, compare names alphabetically
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}

public class EmployeeTreeSetExample {
    public static void main(String[] args) {
        TreeSet<Employee> employees = new TreeSet<>();

        employees.add(new Employee("Harsha", 40000));
        employees.add(new Employee("Akash", 30000));
        employees.add(new Employee("Meena", 30000));
        employees.add(new Employee("Raj", 50000));
        employees.add(new Employee("Zara", 40000));

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
