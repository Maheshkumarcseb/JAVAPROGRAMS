import java.util.HashMap;

public class EqualArray {
    public static void main(String[] args)
    {
        int[] arr1={1,2,3,2};
//        int[] arr2={2,3,1,2};
        int[] arr2={5,4,3,2};
        HashMap<Integer,Integer> hm1 = new HashMap<>();
        HashMap<Integer,Integer> hm2 = new HashMap<>();

        for(int i=0;i<arr1.length;i++)
        {
            hm1.put(arr1[i],hm1.getOrDefault(arr1[i],0) +1);
        }
        for(int i=0;i<arr2.length;i++)
        {
            hm2.put(arr2[i], hm2.getOrDefault(arr2[i],0)+1);
        }
        System.out.println(hm1.equals(hm2));

    }
}
