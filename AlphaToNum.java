import java.util.*;

class Solution {
    
    public int titleToNumber(String columnTitle) {
        int result = 0;

        for(int i = 0; i < columnTitle.length(); i++) {
            char ch = columnTitle.charAt(i);
            int value = ch - 'A' + 1;
            result = result * 26 + value;
        }

        return result;
    }
}

public class AlphaToNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Excel Column Title: ");
        String columnTitle = sc.next();

        Solution obj = new Solution();
        int result = obj.titleToNumber(columnTitle);

        System.out.println("Column Number: " + result);
    }
}