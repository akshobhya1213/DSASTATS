class Solution {
    public int subarraySum(int[] nums, int k) {
         HashMap<Integer,Integer> ak = new HashMap<>();
         ak.put(0,1);
         int result = 0;
         int prefix= 0;
         for(int num:nums){

          prefix += num;

          if(ak.containsKey(prefix-k)){
            result += ak.get(prefix-k);
          }

          ak.put(prefix,ak.getOrDefault(prefix,0)+1);

        
    

         }

        return result;
    }
}