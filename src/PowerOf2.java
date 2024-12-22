import java.util.Scanner;
public class PowerOf2 {

        public  void powerOf2() {
            // Taking input from the user
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the power value N (0 <= N < 31): ");
            int n = scanner.nextInt();

            // Validate the input
            if (n < 0 || n >= 31) {
                System.out.println("Invalid input! Please enter a value of N between 0 and 30.");
            } else {
                System.out.println("Table of powers of 2 up to 2^" + n + ":");
                for (int i = 0; i <= n; i++) {
                    System.out.println("2^" + i + " = " + (int)Math.pow(2, i));
                    int year=2000+(int)Math.pow(2, i);
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

            // Close the scanner
            scanner.close();
        }
    }


