import java.util.Scanner;

public class FullNameApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First name: ");
        String firstName = scanner.next().trim();

        System.out.print("Last name: ");
        String lastName = scanner.next().trim();

        System.out.print("Suffix: ");
        String suffix = scanner.next().trim();

        String fullName = firstName + " " + lastName + ", " + suffix;
        System.out.println("Full Name: " + fullName);

        scanner.close();

    }
}
