import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("eat");
        str.add("tea");
        str.add("tan");
        str.add("ate");
        str.add("nat");
        str.add("bat");

        ArrayList<ArrayList<String>> list1 = new ArrayList<>();
        int n = str.size();
        boolean[] visited = new boolean[n];  // to mark already grouped elements

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            ArrayList<String> list = new ArrayList<>();
            list.add(str.get(i));
            visited[i] = true;

            for (int j = i + 1; j < n; j++) {
                if (!visited[j] && isValidAnagram(str.get(i), str.get(j))) {
                    list.add(str.get(j));
                    visited[j] = true;
                }
            }
            list1.add(list);
        }

        // Print the grouped anagrams
        for (ArrayList<String> group : list1) {
            System.out.println(group);
        }
    }

    // Method to check if two strings are valid anagrams
    static boolean isValidAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        int[] freq = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'a']++;
            freq[str2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0)
                return false;
        }

        return true;
    }
}
