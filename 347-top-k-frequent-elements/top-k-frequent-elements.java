class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      
      HashMap<Integer,Integer> map = new HashMap<>();

      List<Integer>[] bucket = new List[nums.length+1];

     for( int num : nums ){

        map.put(num,map.getOrDefault(num,0)+1);
     }


     for(int key : map.keySet()){

        int freq = map.get(key);


        if(bucket[freq] == null){
            bucket[freq] = new ArrayList<>();

        }

        bucket[freq].add(key);
     }



     int result[] = new int[k];

     int hello = 0;

     for(int i = bucket.length-1; i >=1; i--){

        if(bucket[i] != null ){
            for(int yu : bucket[i]){
                result[hello++] = yu;



                if(hello == k){
                    return result;
                }
            }
        }

     }

     return result;

    }
}