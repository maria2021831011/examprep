package exam2;


import java.util.ArrayList;
import java.util.List;

class Professor extends Person {

        protected int staffNumber;
        private int yearsOfService;
        public int numberOfClasses;
        public List<Student> supervisedStudents;

        public Professor(String name, String phoneNumber, String emailAddress, Address address, List<Student>supervisedStudents, int staffNumber, int yearsOfService, int numberOfClasses) {
            super(name, phoneNumber, emailAddress, address);
            this.staffNumber = staffNumber;
            this.yearsOfService = yearsOfService;
            this.numberOfClasses = numberOfClasses;
            this.supervisedStudents=supervisedStudents;
        }
    public int getSalary() {
        return (5000 * yearsOfService) + (1000 * numberOfClasses);
    }

        @Override
        public void purchaseParkingPass() {
            System.out.println(name + " has purchased a parking pass.");
        }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Staff Number: " + staffNumber);
        System.out.println("Years of Service: " + yearsOfService);
        System.out.println("Number of Classes: " + numberOfClasses);
        System.out.println("Salary: $" + getSalary());
    }
}
