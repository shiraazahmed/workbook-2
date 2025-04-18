import java.util.Scanner;

public class CellPhone {

    private int serialNum;
    private String model;
    private String carrier;
    private String phoneNum;
    private String owner;

    public CellPhone() {
        this.serialNum = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNum = "";
        this.owner = "";
    }

    public CellPhone(int serialNum, String model, String carrier, String phoneNum, String owner) {
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
        CellPhone cellPhone = new CellPhone();
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


    }
}
