import java.util.Scanner;

public class LeapYearchecker{
    public void checkLeapYear() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeap = false;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeap = true;
        }
        if (isLeap) {
            System.out.println("The year you entered is a leap year.");
        } else {
            System.out.println("The year you entered is NOT a leap year.");
        }
        scanner.close();
    }
        public static void main(String[] args) {
        LeapYearChecker checker = new LeapYearChecker();
        checker.checkLeapYear();
    }
}
