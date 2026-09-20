//leetcode 15. 3Sum

class q4 {
    static List<List<Integer>> threeSum(int[] a) {
        Arrays.sort(a);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < a.length - 2; i++) {
            if (i > 0 && a[i] == a[i - 1]) continue;
            int l = i + 1, r = a.length - 1;

            while (l < r) {
                int s = a[i] + a[l] + a[r];

                if (s == 0) {
                    ans.add(Arrays.asList(a[i], a[l], a[r]));
                    while (l < r && a[l] == a[l + 1]) l++;
                    while (l < r && a[r] == a[r - 1]) r--;
                    l++; r--;
                } else if (s < 0) l++;
                else r--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(a));
    }
}