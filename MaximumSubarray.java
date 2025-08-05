public class MaximumSubarray {
    public static void main(String[] args) {
        int[] num={-2, 1, -3,4,-1,2,1,-5,4};
        int n = num.length;
        int max_sum=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=num[i];
            max_sum=Math.max(sum,max_sum);
            if(sum<0) sum=0;
        }
        System.out.println(max_sum);
    }
}
