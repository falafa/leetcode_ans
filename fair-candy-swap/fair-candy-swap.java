/**
设爱丽丝和鲍勃分别总计有 S_A, S_BS 的糖果。

如果爱丽丝给了糖果 x，并且收到了糖果 y，那么鲍勃收到糖果 x 并给出糖果 y。那么，我们一定有/Sa-x+y=Sb-y+x -> y=x+1/2(Sb-Sa)
**/
class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sa=0,sb=0;
		for(int x: A) sa+=x;
		for(int y: B) sb+=y;
		int delta=(sb-sa)/2;
		
		Set<Integer>setB=new HashSet();
		for(int y: B)setB.add(y);
		
		for(int x: A)
			if(setB.comtains(x+delta))
				return new int[]{x,x+delta};
    }
}