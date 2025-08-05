public class MergeSortedArray {
    public static void main(String[] args)
    {
        int[] arr1={1,3,5};
        int[] arr2={2,4,6};
        int n1=arr1.length;
        int n2= arr2.length;
        int[] res= new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2)
        {
            if(arr1[i]<arr2[j])
                res[k++]=arr1[i++];
            else
                res[k++]=arr2[j++];
        }
        while(j<n2)
            res[k++]=arr2[j++];
        while(i<n1)
            res[k++]=arr1[i++];
        for(int ele:res)
        {
            System.out.print(ele+" ");
        }
    }
}
