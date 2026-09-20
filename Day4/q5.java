class q5 {
    public List<List<Integer>> fourSum(int[] a, int target) {
        Arrays.sort(a);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < a.length - 3; i++) {
            if (i > 0 && a[i] == a[i - 1]) continue;

            for (int j = i + 1; j < a.length - 2; j++) {
                if (j > i + 1 && a[j] == a[j - 1]) continue;

                int l = j + 1, r = a.length - 1;

                while (l < r) {
                    long s = (long)a[i] + a[j] + a[l] + a[r];

                    if (s == target) {
                        ans.add(Arrays.asList(a[i], a[j], a[l], a[r]));

                        while (l < r && a[l] == a[l + 1]) l++;
                        while (l < r && a[r] == a[r - 1]) r--;

                        l++;
                        r--;
                    } else if (s < target) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }
        }

        return ans;
    }
}