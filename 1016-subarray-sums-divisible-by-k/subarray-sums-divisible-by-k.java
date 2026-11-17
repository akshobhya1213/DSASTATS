class Solution {
    public int subarraysDivByK(int[] nums, int k) {
    HashMap<Integer,Integer> map = new HashMap<>();
      map.put(0,1);

    //   if(rem<0){
    //     rem += k;
    // }


    int prefix = 0;
    int result = 0;

    for(int num: nums){
        prefix += num;

        int mod = prefix%k;
        // if(mod<0){
            
        // }
        if(mod<0){
               mod +=k;
            }

        if(map.containsKey(mod)){

            
            result += map.get(mod);
        }



         map.put(mod,map.getOrDefault(mod,0)+1);


    }

    return result;

    }

}