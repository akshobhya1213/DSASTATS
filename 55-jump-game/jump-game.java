class Solution {
    public boolean canJump(int[] nums) {
      int first = nums.length-1;
      for(int idx = nums.length-1;idx>=0;idx--){
        if(idx + nums[idx] >= first ){
            first = idx;
        }
      }

      return first == 0;
    }
}