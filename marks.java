import java.util.Scanner;

public class LecturerMarks {

    public void calculateAverageMarks() {
        Scanner scanner = new Scanner(System.in);

        // Input marks
        System.out.print("Enter marks for Java Programming: ");
        double javaMarks = scanner.nextDouble();

        System.out.print("Enter marks for Networking: ");
        double networkingMarks = scanner.nextDouble();

        System.out.print("Enter marks for Maths: ");
        double mathsMarks = scanner.nextDouble();

        double average = (javaMarks + networkingMarks + mathsMarks) / 3;

        System.out.println("Marks for Java Programming is: " + javaMarks);
        System.out.println("Marks for Networking is: " + networkingMarks);
        System.out.println("Marks for Maths is: " + mathsMarks);
        System.out.println("The average is: " + average);

        scanner.close();
    }
    public static void main(String[] args) {
        LecturerMarks marks = new LecturerMarks();
        marks.calculateAverageMarks();
    }
}
