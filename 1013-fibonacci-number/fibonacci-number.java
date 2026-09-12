class Solution {
    public int fib(int n) {
        if( n == 0){
            return n;
        }
        

      int a = 1; int b= 1;
      for(int i = 3 ; i<=n ;i++){
        int c = a+b;
        a = b;
        b = c;
      }
        return b;
    }
}