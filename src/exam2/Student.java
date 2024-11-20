package exam2;

class Student extends Person {
    public int studentNumber;
    public int averageMark;


    public Student(String name, String phoneNumber, String emailAddress, Address address, int studentNumber, int averageMark) {
        super(name, phoneNumber, emailAddress, address);
        this.studentNumber = studentNumber;
        this.averageMark = averageMark;
    }

    public boolean isEligibleToEnroll(String course) {
        return averageMark >= 50;
    }

    public int getSeminarsTaken() {
        return 5;
    }


    @Override
    public void purchaseParkingPass() {
        System.out.println(name + " has purchased a parking pass.");
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student Number: " + studentNumber);
        System.out.println("Average Mark: " + averageMark);
    }
}

