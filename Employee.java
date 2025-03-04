public class Employee {
    
    private int id;
    private double salary;

    private static final double MIN_SALARY = 3000.0;

    
    public Employee(int id, double salary) {
        this.id = id;
        setSalary(salary);    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    
    public void setSalary(double salary) {
        if (salary >= MIN_SALARY) {
            this.salary = salary;
        } else {
            System.out.println("Error: Salary must be at least " + MIN_SALARY);
        }
    }

    public static void main(String[] args) {
        
        Employee emp1 = new Employee(101, 5000.0);
        Employee emp2 = new Employee(102, 2500.0);  // This will trigger validation

        System.out.println("Employee 1 ID: " + emp1.getId() + ", Salary: " + emp1.getSalary());
        System.out.println("Employee 2 ID: " + emp2.getId() + ", Salary: " + emp2.getSalary());
        
        emp1.setSalary(2000.0); 
    }
}