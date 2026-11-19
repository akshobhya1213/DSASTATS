class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    int count = 0;
    int maxy = 0;


    for(int num : nums){
        if(num == 1){
            count++;
            maxy = Math.max(maxy,count);
        } else {
            count = 0;
        }
    }

    return maxy;      
  


    }
}