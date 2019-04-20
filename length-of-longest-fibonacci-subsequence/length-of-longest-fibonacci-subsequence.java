/**
dp solution
dp[a, b] represents the length of fibo sequence ends up with (a, b)
Then we have dp[a, b] = (dp[b - a, a] + 1 ) or 2
The complexity reduce to O(N^2).
**/
class Solution{
	public int lenLongestFibSubseq(int[]A){
		int N=A.length;
		int[][] dp =new int [A.length][A.length];
		Map<Integer,Integer> index=new HashMap();
		for(int i=0;i<N;i++) index.put(A[i],i);
		
		//Map<Integer,Integer>longest=new HashMap();
		int ans=0;
		
		for(int k=0;k<N;k++)
			for(int j=0;j<k;j++){
				int i=index.getOrDefault(A[k]-A[j],-1);
				dp[j][k]=(A[k]-A[j]<A[j]&&i>=0)?dp[i][j]+1:2;
				ans=Math.max(res,dp[j][k]);
				/**
				if(i>=0&&i<j){
					//
					int cand=longest.getOrDefault(i*N+j,2)+1;
					longest.put(j*N+k,cand);
					ans=Math.max(ans,cand);
				**/
				}
			}
			return ans>=3? ans:0;
	}
}