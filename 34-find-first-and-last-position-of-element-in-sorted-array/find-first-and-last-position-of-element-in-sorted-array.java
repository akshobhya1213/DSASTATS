class Solution {

    public int firstpos(int[] nums,int target){
        int left = 0 , right = nums.length-1;

        int firstindex = -1;


        while(left <= right){
            int mid = (left+right)/2;

            if(nums[mid] == target ){
                firstindex = mid;
                right = mid-1;
            } else if (target > nums[mid]){
                left = mid +1;
            } else {
                 right = mid -1;
            }
        }

        return firstindex;
    }


     public int lastpos(int[] nums,int target){
        int left = 0 , right = nums.length-1;

        int lastindex = -1;


        while(left <= right){
            int mid = (left+right)/2;

            if(nums[mid] == target ){
                lastindex = mid;
                left = mid +1;
            } else if (target > nums[mid]){
                left = mid +1;
            } else {
                 right = mid -1;
            }
        }

        return lastindex;
    }
    public int[] searchRange(int[] nums, int target) {
      if(nums == null || nums.length == 0){
        return new int[]{-1,-1};
      }  

      int first = firstpos(nums,target);
      int last = lastpos(nums,target);


      return new int []{first,last};
    }
}