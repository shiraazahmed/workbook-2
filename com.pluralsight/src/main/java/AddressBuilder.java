import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the following information:");

        System.out.println("What is your full name?: ");
        String fullName = scanner.nextLine();

        System.out.println("What is your shipping address?");
        String shipADD = scanner.nextLine();

        System.out.println("What is your billing city?:");
        String billCity = scanner.nextLine();

        System.out.println("What is your billing state?:");
        String billState = scanner.nextLine();

        System.out.println("What is your billing zip?:");
        String billZip = scanner.nextLine();

        System.out.println("What is your billing address?:");
        String billAdd = scanner.nextLine();

        System.out.println("What is your shipping city?:");
        String shipCity = scanner.nextLine();

        System.out.println("What is your Shipping state?:");
        String shipState = scanner.nextLine();

        System.out.println("What is your shipping zip?:");
        String shipZip = scanner.nextLine();

        StringBuilder addressBuilder = new StringBuilder();
        addressBuilder.append(fullName.trim() + "\n");
        addressBuilder.append(shipADD.trim() + "\n");
        addressBuilder.append(billCity.trim() + "\n");
        addressBuilder.append(billState.trim() + "\n");
        addressBuilder.append(billZip.trim() + "\n");
        addressBuilder.append(billAdd.trim() + "\n");
        addressBuilder.append(shipCity.trim() + "\n");
        addressBuilder.append(shipState.trim() + "\n");
        addressBuilder.append(shipZip.trim() + "\n");

        System.out.println(addressBuilder.toString());
        scanner.close();




    }
}
