class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;

        int right = 0;
        for(int pil : piles){

          right = Math.max(right,pil);
        }


        while(left < right){

            int mid = (left+right)/2;


            if(correcthours(piles,h,mid)){
                right = mid;
                
            } else {
                left = mid+1;

            }



        }


        return left;
    }

    private boolean correcthours(int[] piles,int h , int speed){

        int hour = 0;


        for(int pile : piles){

            hour += (int) Math.ceil((double)pile/speed);
        }


        return hour <= h;


    }


}   