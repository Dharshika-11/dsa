import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int first = -1;
        int last = -1;

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();

            if (value == x) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }

        System.out.println(first + " " + last);

        sc.close();
    }
}
