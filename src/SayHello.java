import java.util.Scanner;

class SayHello {
    public static void main(String[] args) {
        String typedValue;

        Scanner input = new Scanner(System.in);

        System.out.println("Please type something");
        typedValue = input.nextLine();

        System.out.println(typedValue);
    }
}