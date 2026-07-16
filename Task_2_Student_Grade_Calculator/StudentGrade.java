import java.util.Scanner;

public class StudentGrade { 

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in); 

        System.out.print("Enter Name: ");
        String n = s.nextLine();

        System.out.print("Enter Total Subjects: ");
        int sub = s.nextInt();

        int total = 0;
        int max = 0; 
        int min = 100; 
        String status = "PASS"; 

        for (int i = 1; i <= sub; i++) {
            System.out.print("Enter marks: ");
            int marks = s.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Wrong marks entered!");
            }

            total = total + marks; 

            if (marks > max) {
                max = marks;
            }
            if (marks < min) {
                min = marks;
            }
        
            if (marks < 35) {
                status = "FAIL";
            }
        }

        double per = total / sub;
        String g = "";

        if (per >= 90) {
            g = "A+";
        } else if (per >= 80) {
            g = "A";
        } else if (per >= 70) {
            g = "B";
        } else if (per >= 60) {
            g = "C";
        } else {
            g = "D";
        }

        System.out.println("Student Name is: " + n);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + per + "%");
        System.out.println("Grade: " + g);
        System.out.println("Highest: " + max);
        System.out.println("Lowest: " + min);
        System.out.println("Final Result: " + status);
        
    }
}