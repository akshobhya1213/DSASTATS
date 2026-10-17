class Solution {
    public boolean isPalindrome(int x) {
 
    if(x<0){
      return false;
    }
    int orginal = x;
    int reverse = 0;
    while(x != 0 ){
       reverse = reverse * 10 + x%10;
       x/=10; 
    }

    if(orginal == reverse){
        return true;
    }

    return false;
    }
}