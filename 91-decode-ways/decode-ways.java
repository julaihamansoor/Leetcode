class Solution {
    public int numDecodings(String s) {
        int l=s.length();
        int dp[]=new int[l+1];
        dp[0]=1;
        if(s.charAt(0)!='0')
        dp[1]=1;
        for(int i=2;i<=l;i++){
            int one=s.charAt(i-1)-'0';
            if(one>=1&&one<=9)
            dp[i]+=dp[i-1];
            int second=s.charAt(i-1)-'0';
            int fir=s.charAt(i-2)-'0';
            int num=fir*10+second;
            if(num>=10&&num<=26)
            dp[i]+=dp[i-2];
        }
        return dp[l];
        
    }
}