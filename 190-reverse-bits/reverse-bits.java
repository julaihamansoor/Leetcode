class Solution {
    public int reverseBits(int n) {
    

     String str=Integer.toBinaryString(n);


     StringBuilder sb=new StringBuilder();
     for (int i = str.length(); i < 32; i++) {
            sb.append('0');
        }

        sb.append(str);
     String rev=sb.reverse().toString();

     long res=Long.parseLong(rev,2);

      return (int)res;

        
    }
}