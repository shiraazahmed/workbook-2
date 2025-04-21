public class TestStats {
    public static void main(String[] args) {
        int[] testScore = { 90,100,100,80,70,60,80,100,90};

        int sum = 0;
        int high = testScore[0];
        int low = testScore[0];

        for (int score : testScore) {
            sum += score;

            if (score > high) {
                high = score;
            }

            if (score < low) {
                low = score;
            }
        }
        double average = (double) sum / testScore.length;
        System.out.println("Test Scores:");
        System.out.printf("Average Score: %.2f%n", average);
        System.out.println("High Score: " + high);
        System.out.println("Low Score: " + low);
    }
}