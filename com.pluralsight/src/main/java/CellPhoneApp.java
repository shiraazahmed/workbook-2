import java.util.Scanner;

public class CellPhoneApp {
    private int serialNum;
    private String model;
    private String carrier;
    private String phoneNum;
    private String owner;

    public CellPhoneApp() {
        this.serialNum = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNum = "";
        this.owner = "";
    }

    public CellPhoneApp(int serialNum, String model, String carrier, String phoneNum, String owner) {
        this.serialNum = serialNum;
        this.model = model;
        this.carrier = carrier;
        this.phoneNum = phoneNum;
        this.owner = owner;
    }
    public int getSerialNum(){
        return serialNum;
    }
    public void setSerialNum(int serialNum)   {
        this.serialNum = serialNum;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model){
        this.model =model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public static void main(String[] args) {
        CellPhoneApp cellPhone = new CellPhoneApp();
        cellPhone.setSerialNum(0);
        cellPhone.setModel("");
        cellPhone.setCarrier("");
        cellPhone.setPhoneNum("");
        cellPhone.setOwner("");

        System.out.println("Owner: " + cellPhone.getOwner());
        System.out.println("Model: " + cellPhone.getModel());
        System.out.println("Serial Number: " + cellPhone.getSerialNum());
        System.out.println("Phone Number: " + cellPhone.getPhoneNum());
        System.out.println("Carrier: " + cellPhone.getCarrier());


        CellPhoneApp cellPhoneApp = new CellPhoneApp();

        cellPhone.setSerialNum(0);
        cellPhone.setModel("");
        cellPhone.setCarrier("");
        cellPhone.setPhoneNum("");
        cellPhone.setOwner("");


            Scanner scanner = new Scanner(System.in);
            String serialNum = ("What is the serial number? ");
            cellPhone.setSerialNum(scanner.nextInt());
            scanner.nextLine();

            System.out.println("What model is the phone? ");
            cellPhone.setModel(scanner.nextLine());

            System.out.println("Who is the carrier? ");
            cellPhone.setCarrier(scanner.nextLine());

            System.out.println("What is the phone number?");
            cellPhone.setPhoneNum(scanner.nextLine());

            System.out.println("Who is the owner of the phone?");
            cellPhone.setOwner(scanner.nextLine());

            System.out.println("Cell phone details loading...");
            System.out.println("Serial Number: " + cellPhone.getSerialNum());
            System.out.println("Owner: " + cellPhone.getOwner());
            System.out.println("Model: " + cellPhone.getModel());
            System.out.println("Phone Number: " + cellPhone.getPhoneNum());
            System.out.println("Carrier: " + cellPhone.getCarrier());

            scanner.close();

    }
}
