class Solution {

    public void back(List<String> res, int left, int right, String s,int n)
    {
        if(s.length()==2*n)
        {
            res.add(s);
            return;
        }
        if(left<n)
        {
            back(res,left+1,right,s+"(",n);
        }
        if(right<left)
        {
            back(res,left,right+1,s+")",n);
        }
    }
    public List<String> generateParenthesis(int n) {
      ArrayList<String> res=new ArrayList<>();
      back(res,0,0,"",n);
      return res;
    }
}
