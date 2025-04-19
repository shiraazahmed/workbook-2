public class RolltheDice {
    //rolls dice
    public int roll() {
        return (int)(Math.random() * 6) + 1; //formula
    }

    public static void main(String[] args) {
        // creating dice to roll
         RolltheDice dice = new RolltheDice();

        // placement holders for variables
        int roll1, roll2;
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        // loop 100
        for (int i = 1; i <= 100; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            int sum = roll1 + roll2;

            // final results for roll
            System.out.println("Roll " + i + ": " + roll1 + " - " + roll2 + " Sum: " + sum);
            // sum check
            if (sum == 2) {
                twoCounter++;
            } else if (sum == 4) {
                fourCounter++;
            } else if (sum == 6) {
                sixCounter++;
            } else if (sum == 7) {
                sevenCounter++;
            }
        }
        // we display final results
        System.out.println("\n Final Count Results Loading...");
        System.out.println("Number 2 appeared: " + twoCounter + " times");
        System.out.println("Number 4 appeared: " + fourCounter + " times");
        System.out.println("Number 6 appeared: " + sixCounter + " times");
        System.out.println("Number 7 appeared: " + sevenCounter + " times");
    }
}



