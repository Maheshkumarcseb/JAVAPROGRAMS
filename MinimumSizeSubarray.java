
/*
public class MinimumSizeSubarray {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int result = minimumSubarray(nums, target);
        System.out.println(result);  // Output: 2
    }

    static int minimumSubarray(int[] nums, int target) {
        int n = nums.length;
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;
        for (int right = 0; right < n; right++) {
            sum += nums[right];

            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
}


 */

public class MinimumSizeSubarray{
    public static void main(String[] args) {
        int[] arr={2,3,1,2,4,3};
        int n = arr.length;
        int target = 7;
         int res = sizeSubarray(arr, n, target);
        System.out.println(res);

    }
    static int sizeSubarray(int[] arr, int n, int target)
    {
        int minLenWindow = Integer.MAX_VALUE;
        int currSum=0;
        int i=0;
        int j=0;
        while(j< n)
        {
            currSum += arr[j];
            j++;
            while(currSum >= target)
            {
                int currWindowSize=j-i;
                minLenWindow=Math.min(minLenWindow, currWindowSize);

                currSum -= arr[i];
                i++;

            }
        }
        return minLenWindow == Integer.MAX_VALUE ? 0 : minLenWindow;
    }
}
