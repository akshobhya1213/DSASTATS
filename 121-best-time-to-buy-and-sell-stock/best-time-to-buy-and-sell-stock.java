class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;

        for(int pri : prices){
            if(pri < min){
                min = pri;
            }

          int profit = pri-min;

          if(profit>max){
            max = profit;
          }


        }
        return max;

    }   
        
}
        

    
