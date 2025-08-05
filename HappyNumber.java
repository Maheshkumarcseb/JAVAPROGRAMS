import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {
        int num = 19;
        boolean res = isHappyNumber(num);
        System.out.println(res);  // Output: true
    }

    static boolean isHappyNumber(int num) {
        HashSet<Integer> seen = new HashSet<>();
        while (num != 1) {
            if (seen.contains(num)) {
                return false;  // loop detected
            }
            seen.add(num);
            num = getSquareSum(num);
        }
        return true;
    }

    // Helper method to get sum of squares of digits
    static int getSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
