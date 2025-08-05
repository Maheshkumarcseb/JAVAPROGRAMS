/*
import java.util.Set;
import java.util.HashSet;
public class LongestSubstring {
    public static void main(String[] args) {
        String str = "mahesh";
        int len = str.length();
        int res = substring(str,len);
        System.out.println(res);
    }
    static int substring(String str, int len)
    {
        int maxlen=0,n;
        for(int i=0;i<len;i++)
       {
               int[] hash = new int[256];
               for(int j=i;j<len;j++)
               {
                    if(hash[str.charAt(j)]==1) break;
                    n= j-i+1;
                    maxlen= Math.max(n, maxlen);
                    hash[str.charAt(j)]=1;
               }
       }
        return maxlen;
    }
}


 */

