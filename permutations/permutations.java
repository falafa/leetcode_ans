//回溯
//
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output=new LinkedList();
		
		ArrayList<Integer> nums_list=new ArrayList<Integer>();
		for (int num:nums)
			nums_list.add(num);
		
		int n=nums.length;
		backtrack(n,nums_list,output,0);
		return output;
    }
	
	public void backtrack(int n, ArrayList<Integer>nums,List<List<Integer>>output,int first){
		if(first==n)output.add(new ArrayList<Integer>(nums));
		
		for (int i=first;i<n;i++){
			// place i-th integer first 
            // in the current permutation
			Collections.swap(nums,first,i);
			// use next integers to complete the permutations
			backtrack(n,nums,output,first+1);
			// backtrack
			Collections.swap(nums,first,i);
		}
	}
}