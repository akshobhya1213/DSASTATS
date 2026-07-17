class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bracket = new List[nums.length+1];
        Map<Integer,Integer> ak = new HashMap<>();
       // int result =0;


        for(int num : nums){
            ak.put(num,ak.getOrDefault(num,0)+1);
        }

        for(int key : ak.keySet()){
            int freq = ak.get(key);
            if(bracket[freq]== null){
               bracket[freq] = new ArrayList<>();
            }

            bracket[freq].add(key);
        }

        int[] result = new int[k];
        int numb = 0;

        for(int i = bracket.length-1; i>=0 && numb<k ; i--){

            if(bracket[i] == null){
                continue;
            }
            for(int num : bracket[i]){
                result[numb++] = num;
            
              if(numb == k){
                break;
              }

            }
        }

        return result;
    }
}