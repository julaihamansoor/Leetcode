class Solution {
    public boolean isSubsequence(String s, String t) {
        int str1=s.length();
        int str2=t.length();
        int i=0;
        int j=0;

        while(i<str1 && j<str2){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        return i==str1;




        
        }


        
    }
