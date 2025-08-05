public class RansomeNote {
    public static void main(String[] args) {

//        String str1 = "aa";  // ransom note
//        String str2 = "ab";  // magazine

//        String str1="a";
//        String str2="b";

        String str1="aa";
        String str2="ab";

        boolean res = isRansomeNote(str1, str2);
        System.out.println(res);  // Expected output: false
    }

    static boolean isRansomeNote(String str1, String str2) {
        if (str1.length() > str2.length())
            return false;

        // Create frequency arrays for 26 lowercase English letters
        int[] freq1 = new int[26];  // for ransom note
        int[] freq2 = new int[26];  // for magazine

        // Count frequency of characters in str1
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            int index = ch - 'a';
            freq1[index]++;
        }

        // Count frequency of characters in str2
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            int index = ch - 'a';
            freq2[index]++;
        }

        // Check if str2 contains enough of each character in str1
        for (int i = 0; i < 26; i++) {
            if (freq1[i] > freq2[i])
                return false;
        }

        return true;
    }
}
