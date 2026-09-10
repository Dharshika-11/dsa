import java.util.*;

public class Cutoff {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = sc.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {
            int score = sc.nextInt();

            if (score >= c) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}