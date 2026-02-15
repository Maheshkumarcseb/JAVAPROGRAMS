// trailing zeros is the number of zeros in the factorial of the given number from the last and it should be continous
//  time complexity - O(log n)
import java.util.*;
public class TrailingZeros {
    public static int calculateZeros(int num)
    {
        int count=0;
        while(num != 0)
        {
            num=num/5;
            count+=num;
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n=sc.nextInt();
        int num=calculateZeros(n);
        System.out.print("number of trailing zeros in fact of given number is:");
        System.out.println(num);
    }

}
