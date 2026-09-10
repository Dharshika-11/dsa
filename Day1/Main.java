import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        System.out.println("Scores:");

        for (int i = 0; i < n; i++) {
            System.out.print(scores[i] + " ");

            if ((i + 1) % 4 == 0) {
                System.out.println();
            }
        }

        System.out.println();

        int sum = 0;
        int lowest = scores[0];
        int highest = scores[0];

        for (int i = 0; i < n; i++) {

            sum += scores[i];

            if (scores[i] < lowest) {
                lowest = scores[i];
            }

            if (scores[i] > highest) {
                highest = scores[i];
            }
        }

        double average = (double) sum / n;

        System.out.printf("Average: %.2f%n", average);
        System.out.println("Lowest Score: " + lowest);
        System.out.println("Highest Score: " + highest);

        System.out.println("Score  Deviation");

        double sumSquaredDeviation = 0;

        for (int i = 0; i < n; i++) {

            double deviation = scores[i] - average;

            System.out.printf("%d     %.2f%n",
                    scores[i], deviation);

            sumSquaredDeviation += deviation * deviation;
        }

        double standardDeviation =
                Math.sqrt(sumSquaredDeviation / n);

        System.out.printf("Standard Deviation: %.2f%n",
                standardDeviation);

        double lowerLimit = average - standardDeviation;
        double upperLimit = average + standardDeviation;

        int count = 0;

        for (int i = 0; i < n; i++) {

            if (scores[i] >= lowerLimit &&
                scores[i] <= upperLimit) {

                count++;
            }
        }

        System.out.println("Scores within one standard deviation: " + count);

        sc.close();
    }
}