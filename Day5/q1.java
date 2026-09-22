//2461. Maximum Sum of Distinct Subarrays With Length K
import java.util.*;
class q1{
    public long maximumSubarraySum(int[] nums, int k) {
        long max = 0;

        for (int i = 0; i <= nums.length - k; i++) {
            HashSet<Integer> set = new HashSet<>();
            long sum = 0;
            boolean distinct = true;
            for (int j = i; j < i + k; j++) {
                if (set.contains(nums[j])) {
                    distinct = false;
                    break;
                }
                set.add(nums[j]);
                sum += nums[j];
            }

            if (distinct) {
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}
