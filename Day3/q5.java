//Find the minimum temperature recorded so far after each hour
import java.util.*;
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long min = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            if (x < min) {
                min = x;
            }
            System.out.print(min + " ");
        }
    }
}