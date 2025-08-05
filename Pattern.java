import java.util.*;

public class Pattern {
    public static void main(String[] args) {
        String str = "ZO*HO";  // even-length example
//        String str = "1234567";

        // Check and convert to odd-length by inserting '*'
        if (str.length() % 2 == 0) {
            int mid = str.length() / 2;
            str = str.substring(0, mid) + "*" + str.substring(mid);
        }

        int n = str.length();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == n / 2) {
                    for (int k = 0; k < n; k++)
                        System.out.print(str.charAt(k) + " ");
                    break;
                } else if (j == i || j == n / 2 || j == n - i - 1)
                    System.out.print(str.charAt(i) + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
