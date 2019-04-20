public class Solution{
	public int numDecoding(String s){
		int n=s.length();
		if(n==0)return 0;
		
		int[]memo=new int[n+1];
		memo[n]=1;
		memo[n-1]=s.cahrAt(n-1)!= '0' ?1:0;//the ways to decode
		
		for(int i=n-2;i>=0;i--)
			if(s.charAt(i)=='0')
				continue;
			else
				memo[i]=(Integer.parseInt(s.substring(i,i+2))<=26)?memo[i+1]+memo[i+2]:memo[i+1];
		
		return memo[0];
	}
}