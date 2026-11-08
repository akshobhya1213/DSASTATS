class Solution {
    public int maxProfit(int[] prices) {

    int goodprice = Integer.MAX_VALUE;
    int max = 0;

    for(int price : prices){
       if(price < goodprice){
        goodprice = price;
       }

       int profit = price - goodprice;

       if(profit > max){
        max = profit;
       }

    }


    return max;





    }
    
    
 }