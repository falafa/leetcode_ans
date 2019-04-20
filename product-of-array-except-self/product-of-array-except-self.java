class Solution {//先计算数字左边各数的乘积，再计算数字右边各数乘积 维护left/right 中间数
    public int[] productExceptSelf(int[] nums) {
        int left = 1;
        int right = 1;
    int len = nums.length;
    int[] output = new int[len];
    for(int i=0;i<len;i++){
        output[i] = left;
        left *= nums[i];
    }
    for(int j=len-1;j>=0;j--){
        output[j] *= right;
        right *= nums[j];
    }
    return output;
    }
}