public class RolltheDice {
    public static int roll() {
        return (int) (Math.random() * 6) + 1; // formula to use rolling dice
    }

    public static void main(String[] args) {
        // int is a variable, keeping track of how many times 2,4,6 and 7 are rolled
        int count2 = 0;
        int count4 = 0;
        int count6 = 0;
        int count7 = 0;
        for (int i = 0; i < 20; i++) {
            int dice1 = roll();
            int dice2 = roll();
            int sum = dice1 + dice2;

            // showing us what is rolled
            System.out.println("Roll " + (i + 1) + ": Dice 1 = " + dice1 + ", Dice 2 = " + dice2 + " (Sum = " + sum + ")");

            // placement to hold variables
            int roll1, roll2;
            int twoCounter = 0;
            int fourCounter = 0;
            int sixCounter = 0;
            int sevenCounter = 0;
        }
        // provides the sum for when 2,4,6, and 7 are rolled
        if (roll() == 2) {
            count2++;
        } else if (roll() == 4) {
            count4++;
        } else if (roll() == 6) {
            count6++;
        } else if (roll()== 7) {
            count7++;
        }
        //shows how many times the num are displayed
        System.out.println("\nFinal counts:"); // \n is for new line
        System.out.println("Number 2 appeared: " + count2 + " times");
        System.out.println("Number 4 appeared: " + count4 + " times");
        System.out.println("Number 6 appeared: " + count6 + " times");
        System.out.println("Number 7 appeared: " + count7 + " times");
    }
}




