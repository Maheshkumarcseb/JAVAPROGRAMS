public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 21, 3, 89, 54, 6, 3, 43};
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        Mergesort(arr, low, high);  // Sort in-place

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    static void Mergesort(int[] arr, int low, int high) {
        if (low >= high)
            return;

        int mid = (low + high) / 2;
        Mergesort(arr, low, mid);
        Mergesort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int k = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right])
                temp[k++] = arr[left++];
            else
                temp[k++] = arr[right++];
        }

        while (left <= mid)
            temp[k++] = arr[left++];

        while (right <= high)
            temp[k++] = arr[right++];

        // Copy sorted elements back to original array
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }
}
