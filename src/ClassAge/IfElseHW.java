package ClassAge;

import java.util.Scanner;

class IfElseHW {
    public static void main(String[] args) {

        char operator;
        Double number1, number2, result;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        number1 = input.nextDouble();

        System.out.println("Enter second number");
        number2 = input.nextDouble();

        if(number1.equals(number2)) {
            System.out.println("Both are equal");
            return;
        }

        if(number1 > number2) {
            System.out.println("Firs number is greater than second");
            return;
        }

        System.out.println("Firs number is less than second");
    }
}
