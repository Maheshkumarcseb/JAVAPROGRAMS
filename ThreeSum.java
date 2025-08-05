import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> res = threeSum(arr);
        System.out.println(res);
    }

    static List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr); // Sort array for two-pointer approach
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < arr.length - 2; i++) {
            // Skip duplicates for 'i'
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            int j = i + 1;
            int k = arr.length - 1;

            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];

                if (sum == 0) {
                    res.add(Arrays.asList(arr[i], arr[j], arr[k]));

                    // Skip duplicates for 'j' and 'k'
                    while (j < k && arr[j] == arr[j + 1]) j++;
                    while (j < k && arr[k] == arr[k - 1]) k--;

                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return res;
    }
}
