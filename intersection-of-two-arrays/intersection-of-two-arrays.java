public class Solution {//Use two hash sets  Time complexity: O(n)
    public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set=new HashSet<>();
		Set<Integer> intersection=new HashSet<>();
		for(int i=-;i<nums1.length;i++){
			set.add(nums1[i]);
		}
		for(int i=0;i<nums2.length;i++){
			if(set.contains(nums2[i])){
				intersection.add(nums2[i]);
			}
		}
		int[]result=new int[intersection.size()];
		int i=0;
		for(Integer num: intersection){
			result[i++]=num;
		}
		return result;
	}
}

public class Solution {//Sort both arrays, use two pointers  Time complexity: O(nlogn)
    public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set=new HashSet<>();
		Arrays.sort(nums1);
		Arrays.sort(nums1);
		int i=0,j=0;
		while(i<nums1.length&&j<nums2.length){
			if(nums1[i]<nums2[j]){
				i++;
			}else if(nums1[i]>nums2[j]){
				j++;
			}else {
				set.add(nums1[i]);
				i++;
				j++;
			}
		}
		int[] result = new int[set.size()];
        int k = 0;
        for (Integer num : set) {
            result[k++] = num;
        }
        return result;

	}
}

