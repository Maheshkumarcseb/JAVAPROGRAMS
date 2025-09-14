import java.util.*;

class AllAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        // Count characters in p
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int window = p.length();

        // First window in s
        for (int i = 0; i < window; i++) {
            sCount[s.charAt(i) - 'a']++;
        }

        // Compare first window
        if (Arrays.equals(pCount, sCount)) {
            result.add(0);
        }

        // Slide the window
        for (int i = window; i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;                // add new char
            sCount[s.charAt(i - window) - 'a']--;       // remove old char

            if (Arrays.equals(pCount, sCount)) {
                result.add(i - window + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        AllAnagrams obj = new AllAnagrams();
        System.out.println(obj.findAnagrams("cbaebabacd", "abc")); // [0, 6]
        System.out.println(obj.findAnagrams("abab", "ab"));        // [0, 1, 2]
    }
}
