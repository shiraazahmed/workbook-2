import java.util.Scanner;

public class FullNameParser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        int positionOfFirstSpace = fullName.indexOf(" ");
        if (positionOfFirstSpace != -1) {
            String firstName = fullName.substring(0, positionOfFirstSpace);
            int positionOfSecondSpace = fullName.lastIndexOf(" ");
            if (positionOfSecondSpace != positionOfFirstSpace) {
                String middleName = fullName.substring(positionOfFirstSpace+ 1, positionOfSecondSpace);
                System.out.println("First name: " + firstName);
                System.out.println("Middle name: " + middleName);
                System.out.println("Last name: " + fullName.substring(positionOfSecondSpace+ 1));
            }else{
                System.out.println("First name: " + firstName);
                System.out.println("Last name: " + fullName.substring(positionOfFirstSpace+ 1));
            }
        } else {
            System.out.println("Name?");
        }
        scanner.close();
    }
}
