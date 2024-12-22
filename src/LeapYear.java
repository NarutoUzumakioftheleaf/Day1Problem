
import java.util.Scanner;

    public class LeapYear {
        public  void leapYear() {
            // Create a Scanner object for user input
            Scanner scanner = new Scanner(System.in);

            // Input: Year (4-digit number)
            System.out.print("Enter a 4-digit year: ");
            int year = scanner.nextInt();

            // Ensure the input is a 4-digit number
            if (year < 1000 || year > 9999) {
                System.out.println("Please enter a valid 4-digit year.");
                return;
            }

            // Determine if it is a leap year
            boolean isLeapYear = false;
            if (year % 4 == 0) {
                if (year % 100 != 0 || year % 400 == 0) {
                    isLeapYear = true;
                }
            }

            // Output the result
            if (isLeapYear) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }
    }


