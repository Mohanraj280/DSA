class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1)
        {
            return s;
        }
        int row=0;
        boolean down=false;
        String[] arr=new String[numRows];
        Arrays.fill(arr,"");
        for(int i=0;i<s.length();i++)
        {
            if(row>=0)
            {
                arr[row]+=s.charAt(i);
            }
            
            if(row == numRows-1)
            {
                down = false;
            }
            if(row==0)
            {
                down = true;
            }
            
            if(!down)
            row--;
            else
            row++;
        }

        String res="";
        for(String ar:arr)
        {
            res+=ar;
        }
        return res;
    }
}
