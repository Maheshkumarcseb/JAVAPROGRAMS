public class IsSubsequence {
    public static void main(String[] args) {
        String str="abc";
        String str1="ahbgdc";

//        String str = "axc", str1 = "ahbgdc";

        boolean res=strMatcher(str,str1);
        System.out.println(res);

    }
    static boolean strMatcher(String str1, String str2)
    {
        int i=0,j=0;
        while(i<str1.length() && j<str2.length())
        {
            if(str2.charAt(j)==str1.charAt(i))
            {
                i++;
                j++;
            }
            else
                j++;
        }
        if(i==str1.length())
            return true;
        else
            return false;

    }
}
