class Solution {
    public String convert(String s, int numRows) {


        if(numRows==1 || s.length()<=numRows){
            return s;
        }

        StringBuilder rows[]=new StringBuilder[numRows];

        for(int i=0;i<numRows;i++){
            rows[i]=new StringBuilder();
        }

        int row=0;
        int direction=1;

        for(int i=0;i<s.length();i++){
            rows[row].append(s.charAt(i));
        

        if(row==numRows-1){
            direction=-1;
        
        }

        if(row==0){
            direction=1;
        }
        row=row+direction;
        }

        StringBuilder sb1=new StringBuilder();


        for(int i=0;i<numRows;i++){
            sb1.append(rows[i]);
        }

        return sb1.toString();
        
    }
}