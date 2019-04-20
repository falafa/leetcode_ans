class Solution {//按位与
    public boolean isPowerOfTwo(int n) {
        boolean flag=false;
        if(n<=0)return false;
        if((n&(n-1))==0)flag=true;
        
    return flag;
    }
}
/**Iterative
if (n == 0) return false;
while (n%2 == 0) n/=2;
return n == 1;
**/
/**recuesive
return n > 0 && (n == 1 || (n%2 == 0 && isPowerOfTwo(n/2)));
**/
