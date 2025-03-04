public class Company {
    static String companyName = "Tech Solutions Ltd.";

    String employeeName;

    public Company(String employeeName) {
        this.employeeName = employeeName;
    }

   
    public void displayDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee Name: " + employeeName);
        System.out.println();
    }

    public static void main(String[] args) {
        
        Company emp1 = new Company("Alice");
        Company emp2 = new Company("Bob");
        Company emp3 = new Company("Charlie");
        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();

        
        companyName = "Innovative Tech Corp.";
        System.out.println("After changing company name:\n");

        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
}