import java.util.Scanner;

class GuessTheNumber {
    public static void main(String[] args) {

        int trials = 10;
        int i, typedNumber, generatedBySystemNumber;

        generatedBySystemNumber = (int) (10 * Math.random());

        System.out.println("Choose a number between 0 and 10. Guess the number within 10 trials");

        for (i = 0; i < trials; i++) {
            if (i > 0) {
                System.out.println("Guess the number");
            }

            Scanner input = new Scanner(System.in);

            typedNumber = input.nextInt();

            if (typedNumber == generatedBySystemNumber) {
                System.out.println("Congratulations, you guessed the number!");
                return;
            }

            if (typedNumber > generatedBySystemNumber) {
                System.out.println("The number is less than " + typedNumber);
            } else {
                System.out.println("The number is greater than " + typedNumber);
            }
        }

        if (i == trials) {
            System.out.println("You have exhausted 10 trials");
        }
    }
}