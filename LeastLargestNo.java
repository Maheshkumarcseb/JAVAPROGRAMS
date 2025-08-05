import java.util.*;

public class LeastLargestNo {
    public static void main(String[] args) {
        int[] arr = {7, 4, 4, 8, 10};
        leastGreater(arr);
    }

    static void leastGreater(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            int minGreater = Integer.MAX_VALUE;
            boolean found = false;

            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i] && arr[j] < minGreater) {
                    minGreater = arr[j];
                    found = true;
                }
            }

            res[i] = found ? minGreater : -1;
        }

        // Output result
        for (int ele : res)
            System.out.print(ele + " ");
    }
}
