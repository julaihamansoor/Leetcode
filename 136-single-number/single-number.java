class Solution {
    public int singleNumber(int[] nums) {
        

        HashMap<Integer,Integer> map= new HashMap<>();

        for(int arr:nums){
            map.put(arr,map.getOrDefault(arr,0)+1);
        }

        int key=0;
        int value;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    
    
          value = entry.getValue();

         if(value==1){
           key=entry.getKey();
         }
        }
        return key;


        
     }

}