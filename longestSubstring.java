import java.util.Set;
import java.util.HashSet;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,max=0;
        Set<Character> st=new HashSet<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(!st.contains(s.charAt(i)))
            {
                st.add(s.charAt(i));
                max=Math.max(max,i-l+1);
            }
            else
            {
                while(st.contains(s.charAt(i)))
                {
                st.remove(s.charAt(l));
                l++;
                }
                st.add(s.charAt(i));
            }
        }
     
        return max;
    }
}
