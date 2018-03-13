// 459. Repeated Substring Pattern
class Solution {
    public boolean repeatedSubstringPattern(String str) {
        int len=str.length();
        for(int i=len/2; i>=1; i--){
            if(len%i==0){
                int m=len/i;
                String sub=str.substring(0,i);
                int k;
                for(k=1;k<m;k++){
                    if(!sub.equals(str.substring(k*i,k*i+i)))break;
                }
                if(k==m)
                    return true;
            }
        }
        return false;
    }
}