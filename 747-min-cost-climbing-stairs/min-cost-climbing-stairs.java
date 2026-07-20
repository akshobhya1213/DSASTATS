class Solution {
    public int minCostClimbingStairs(int[] cost) {
       int n = cost.length;
       int[] minlen = new int[n+1];

       for(int i = 2;i<=n;i++){
        minlen[i] = Math.min(cost[i-1]+minlen[i-1],cost[i-2]+minlen[i-2]);
       }

       return minlen[n];
    }
}