public class Solution {
    public void nextPermutation(int[] nums) {
		int i =nums.length-2;
		while(i>=0&&nums[i]>=nums[i+1]){//寻找第一个出现逆序对的位置
			i--;
		}
		if(i>0){//寻找第一个大于该位置的数的位置
			int j=nums.length-1;
			while(j>=0&&nums[j]<=nums[i]){
				j--;
			}
			swap(nums,i,j);//交换
		}
		reverse(nums,i+1);//该位置后面的数进行逆序
	}
	public void reverse(int[]nums,int index){
		int i=index,j=nums.length-1;
		while(i<j){
			swap(nums,i,j);
			i++;
			j--;
		}
	}
	public void swap(int[] nums,int i,int j){
		int t=nums[i];
		nums[i]=nums[j];
		nums[j]=t;
	}
}

//时间复杂度：O(n)，在最坏的情况下，只需要对整个数组进行两次扫描。

//空间复杂度：O(1)，没有使用额外的空间，原地替换足以做到。