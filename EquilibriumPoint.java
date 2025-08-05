//public class EquilibriumPoint {
//    public static void main(String[] args) {
////        int[] arr = {1, 2, 0, 3};
////        int[] arr={1,1,1,1};
//        int[] arr ={-7,1,5,2,-4,3,0};
//        int n = arr.length;
//        int res = equilibrium(arr, n);
//        System.out.println(res);
//    }
//        static int equilibrium(int[] arr, int n)
//        {
//            int sum=0,leftsum=0;
//            for(int i=0;i<n;i++)
//            {
//                sum+=arr[i];
//            }
//            for(int i=0;i<n;i++)
//            {
//                leftsum += arr[i];
//                if(leftsum == sum)
//                    return i;
//                else
//                    sum-=arr[i];
//            }
//            return -1;
//        }
//    }
//




public class EquilibriumPoint {
    public static void main(String[] args) {
        int[] arr ={-7,1,5,2,-4,3,0};
        int n = arr.length;
        int res = equilibrium(arr, n);
        System.out.println(res);  // Expected: -1 (no equilibrium)
    }

    static int equilibrium(int[] arr, int n) {
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) {
                return i;  // equilibrium index
            }
            leftSum += arr[i];
        }

        return -1;
    }
}
