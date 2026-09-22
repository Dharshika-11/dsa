//Given an array arr, find the floor of average of the prefix array at every index
import java.util.*;
class q2{
    public ArrayList<Integer> prefixAverage(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        long sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            ans.add((int)(sum / (i + 1)));
        }

        return ans;
    }
}