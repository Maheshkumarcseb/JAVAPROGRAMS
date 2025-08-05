import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;
        int target = 6;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] == target) {
                System.out.printf("element found at index %d", mid);
//                System.exit(0);
                break;
            } else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;

        }
    }
}
