//geeks of geeks count distinct numbers
import java.util.*;

class q5 {
    ArrayList<Integer> countDistinct(int[] arr, int k) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i <= arr.length - k; i++) {
            HashSet<Integer> set = new HashSet<>();

            for (int j = i; j < i + k; j++) {
                set.add(arr[j]);
            }

            ans.add(set.size());
        }

        return ans;
    }
}