public class Methods {

    public void findLargestAndSmallest() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        int smallest = num1;
        int largest = num1;

        // Determine the smallest number
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }

        // Determine the largest number
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }

        // Results to be displayed
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
        System.out.println(smallest + " is your smallest and " + largest + " is your largest");

        scanner.close();
    }
}