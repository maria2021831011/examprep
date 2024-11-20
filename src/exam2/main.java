package exam2;



import java.util.ArrayList;
import java.util.List;
public class main

{ public static void main(String[] args) {
    Address professorAddress = new Address("123 savar", "City", "State", 12345, "Country");
    Address studentAddress = new Address("456 Student St", "City", "State", 67890, "Country");
    Student student1 = new Student("maria", "555-1234", "maria.ll@student.com", studentAddress, 1001, 80);
    Student student2 = new Student("belly", "555-5678", "belly.kh@student.com", studentAddress, 1002, 60);
    List<Student> supervisedStudents = new ArrayList<>();
    supervisedStudents.add(student1);
    supervisedStudents.add(student2);
    Professor professor = new Professor("robin sir", "555-9876", "dr.robin@university.com", professorAddress, supervisedStudents, 101, 10, 3);
    System.out.println("Professor Information:");
    professor.displayInfo();
    System.out.println("\nSupervised Students:");
    for (Student student : professor.supervisedStudents) {
        student.displayInfo();
    }
    System.out.println("\nActions:");
    professor.purchaseParkingPass();
    student1.purchaseParkingPass();
    student2.purchaseParkingPass();
        }
    }

