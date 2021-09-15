import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        char operator;
        Double number1, number2, result;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        number1 = input.nextDouble();

        System.out.println("Choose an operator: +, -, *, /, m");
        operator = input.next().charAt(0);

        System.out.println("Enter second number");
        number2 = input.nextDouble();

        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println("The result of plus operation it is: " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.println("The result of plus minus operation it is: " + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.println("The result of multiply operation it is: " + result);
                break;

            case '/':
                result = number1 / number2;
                System.out.println("The result of divide operation it is: " + result);
                break;

            case 'm':
                result = (number1 + number2) / 2;
                System.out.println("The media between " + number1 + " and " + number2 + " it is: " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();
    }
}