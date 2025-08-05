public class TwoSumII {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target = 9;
        int[] res =helperr(arr, target);
        for(int i=0;i<res.length;i++)
            System.out.print(res[i]+" ");
    }
    static int[] helperr(int[] arr, int target)
    {
        int i=0,count=0;
        int j=arr.length-1;
        int[] res=new int[2];
        while(i<j)
        {
            if(arr[i]+arr[j] == target)
            {
                res[count++]=i+1;
                res[count]=j+1;
                break;

            }

            else if(arr[i] + arr[j] < target)
                i++;
            else j--;
        }
        return res;

    }
}
