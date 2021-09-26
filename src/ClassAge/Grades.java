package ClassAge;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {

        double grade;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number from 0 to 100");
        grade = scanner.nextDouble();

        if (grade < 60) {
            System.out.println("Grade F");
        } else if (grade >= 60 && grade < 70) {
            System.out.println("Grade D");
        } else if (grade >= 70 && grade < 80) {
            System.out.println("Grade C");
        } else if (grade >= 80 && grade < 90) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade A");
        }
    }
}