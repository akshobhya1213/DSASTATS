class Solution {
    public String longestPalindrome(String s) {


       if(s.length()<=1){
         return s;
       }  

       String res = "";
       for(int i = 0;i < s.length();i++){
        int low = i;
        int high = i;

        while(low>=0 && high <s.length() && s.charAt(low) == s.charAt(high)){
            if(high - low +1 > res.length()){
                res = s.substring(low,high+1);
            }

            low--;
            high++;
        }

         low = i;
         high = i+1;

        while(low >=0 && high < s.length() && s.charAt(low)==s.charAt(high)){

            if(high-low+1 > res.length()){
                res = s.substring(low,high+1);
            }




         low--;
         high++;
        }

       }

        return res;

    }
}
