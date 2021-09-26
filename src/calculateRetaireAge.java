import java.time.LocalDate;
import java.util.Scanner;

public class calculateRetaireAge {
    public static void main(String[] args) {

        String gender;
        int currentAge, retirementAgeW = 65, retirementAgeM = 70, currentYear = getTheYear();

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your gender:");
        gender = input.nextLine();

        System.out.println("Please enter your current age:");
        currentAge = input.nextInt();

        int yourRetireAge;

        if (gender.equals("M")) {
            yourRetireAge = retirementAgeM - currentAge;
        } else {
            yourRetireAge = retirementAgeW - currentAge;
        }

        if (yourRetireAge < 0) {
            System.out.println("---------");
            System.out.println("You are already retired for " + Math.abs(yourRetireAge) + " years.");
            System.out.println("You are retired since " + (currentYear - Math.abs(yourRetireAge)) + "");
            System.out.println("---------");

            input.close();
            return;
        }

        if (yourRetireAge == 0) {
            System.out.println("---------");
            System.out.println("You are retiring this year");
            System.out.println("---------");

            input.close();
            return;
        }

        System.out.println("---------");
        System.out.println("You have " + yourRetireAge + " years to retirement.");
        System.out.println("The year will be " + (currentYear + yourRetireAge) + " when you retire.");
        System.out.println("---------");

        input.close();
    }

    static int getTheYear() {
        LocalDate current_date = LocalDate.now();
        return current_date.getYear();
    }
}
