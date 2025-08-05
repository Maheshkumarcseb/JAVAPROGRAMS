class ValidAnagram {

    public static void main(String[] args) {
//         String s = "anagram", t = "nagaram";
        String  s = "rat", t = "car";
         boolean res = isValidAnagram(s,t);
        System.out.println(res);
    }
    static boolean isValidAnagram(String str1, String str2) {
        if(str1.length() != str2.length()) return false;
        char[] charr = new char[26];
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        for(int i=0 ;i<str1.length();i++)
        {
            char ch = str1.charAt(i);
            charr[ch-'a']++;
        }

        for(int i=0 ;i<str2.length();i++)
        {
            char ch = str2.charAt(i);
            charr[ch-'a']--;
        }

        for(int i=0;i<charr.length;i++)
        {
            if(charr[i]!=0)
                return false;
        }
        return true;
    }
}
