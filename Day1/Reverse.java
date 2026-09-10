import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String reversed = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }

        System.out.println(reversed);

        sc.close();
    }
}

/* 
 * Problem: Reverse a given string.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
