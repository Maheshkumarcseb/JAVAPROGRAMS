public class ValidPalindrome {
    public static void main(String[] args) {
//        String str = "mahesh";
        String str = "A man, a plan, a canal: Panama";
        str = str.toLowerCase();
        str = str.replaceAll("[^a-z]","");
        int len = str.length();
        boolean res=palindromee(str,len);
        System.out.println(res);

    }
    static boolean palindromee(String str, int n) {
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            if (str.charAt(i) == str.charAt(j))
            {
                i++;
                j--;
            }
            else
                return false;

        }
        return true;
    }
}
