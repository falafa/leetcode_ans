//The comparison A[i] < A[i+1] in a mountain array looks like [True, True, True, ..., True, False, False, ..., False]
//
class Solution{
 public int peakIndexInMountainArray(int[] A) {
	 int lo=0,hi=A.length-1,mi=0;
	 while(lo<hi){
		mi=lo+(hi-lo)/2;
		if(A[mi]<A[mi+1]){
			lo=mi+1;
		}else
			hi=mi;
	 }
	return lo;
 }
}