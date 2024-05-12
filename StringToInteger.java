class Solution {
    public int myAtoi(String s) {
       s=s.trim();
       int num=0;
        if(s.isEmpty())
        {
            return 0;
        }
        int i=0;
        boolean pos = s.charAt(0) == '+';
        boolean neg = s.charAt(0) == '-';
        if(neg||pos)
        {
            i++;
        }
        while(i<s.length() && Character.isDigit(s.charAt(i)))
        {
            int digit = s.charAt(i)-'0';
            if(num>Integer.MAX_VALUE/10 || (num==Integer.MAX_VALUE/10 && digit>Integer.MAX_VALUE%10))
            {
                return neg?Integer.MIN_VALUE : Integer.MAX_VALUE;   
            }
            num=num*10+digit;
            i++;
        }
        return neg?-num:num;
    }
}
