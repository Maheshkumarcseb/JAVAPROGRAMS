public class PascalTriangle {
    public static void main(String[] args) {
        int n = 6;
        for(int row=1;row<=n;row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print("  "); // two spaces for better alignment
            }
            for (int col = 1; col <= row; col++) {
                int val = fact(row - 1) / (fact(col - 1) * fact(row - col));
                System.out.print(val + "   "); // three spaces for padding

            }
            System.out.println();
        }


    }
    static int fact(int num)
    {
        if(num==0 || num ==1)
            return 1;
        else
            return num*fact(num-1);
    }
}
