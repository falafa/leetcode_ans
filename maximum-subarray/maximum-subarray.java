class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
		int[]dp=new int[n];
		dp[0]=nums[0];
		int max=dp[0];
		
		for(int i=1;i<n;i++){
			dp[i]=nums[i]+(dp[i-1]>0?dp[i-1]:0);
			max=Math.max(max,dp[i]);
		}
		
		return max;
    }
}

O(n)
class Solution{
	public int maxSubArray(int[] nums){
		int maxSoFar=A[0], maxEndingHere=A[0];
    for (int i=1;i<A.length;++i){
    	maxEndingHere= Math.max(maxEndingHere+A[i],A[i]);
    	maxSoFar=Math.max(maxSoFar, maxEndingHere);	
    }
    return maxSoFar;
	}
}