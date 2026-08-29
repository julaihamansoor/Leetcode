class Solution {
    public boolean isPalindrome(String s) {



        String str=s.toLowerCase();
        //String s1 = str.replaceAll("[^a-zA-Z]", "");
        String s1 = str.replaceAll("[^a-zA-Z0-9]","");

        StringBuilder sb=new StringBuilder(s1);
        sb.reverse();
        boolean result=s1.equals(sb.toString());


        return result;
    }
}