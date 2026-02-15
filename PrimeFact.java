import java.util.Scanner;
public class PrimeFact {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int num=sc.nextInt();
        for(int i=2;i*i<=num;i++){
            while(num%i==0){
                System.out.print(i+" ");
                num=num/i;
            }
        }
        System.out.print("prime factorization of the number is:");
        System.out.println(num);
    }
}
