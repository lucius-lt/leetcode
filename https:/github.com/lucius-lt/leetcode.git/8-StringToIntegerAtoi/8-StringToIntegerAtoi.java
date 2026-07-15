// Last updated: 7/16/2026, 1:12:48 AM
class Solution {
    public int myAtoi(String s) {
        int n =s.length();
        int idx =0;
        int sign=1;
        int res=0;

//ignoring the white spaces if any
        while(idx<n&&s.charAt(idx)==' ') idx++;

//checking for any positive or negative sign
        if(idx<n&&(s.charAt(idx)=='+'||s.charAt(idx)=='-')){
            sign = (s.charAt(idx)=='-')? -1:1;
            idx++;
        }





    while(idx<n &&( s.charAt(idx)>='0'&& s.charAt(idx)<='9')){
      int digit = s.charAt(idx)-'0';
      if(res>(Integer.MAX_VALUE-digit)/10){
        return (sign ==1)? Integer.MAX_VALUE: Integer.MIN_VALUE;
      }

      res= res*10+digit;
      idx++;
    }
    return res*sign;

    }
}