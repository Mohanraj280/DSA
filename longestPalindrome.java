class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1)
        {
            return s;
        }
        String maxStr = s.substring(0,1);
        int max=1;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+max;j<=s.length();j++)
            {
                if(j-i > max && isPali(s.substring(i,j)))
                {
                    max = j-i;
                    maxStr=s.substring(i,j);
                }
            }
        }
          return maxStr;
    }

    public boolean isPali(String s)
    {
        int left=0;
        int right=s.length()-1;
        while(left<=right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                return false;
              
            }
              left++;
              right--;
            
        }
             return true;
    }
}
