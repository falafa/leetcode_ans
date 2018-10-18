public static int[] twoSum(int[] nums, int target) {
        int[]results=new int[2];
        //int[]sums=new int[(nums.length*(nums.length-1))/2];
        for(int i=0;i<nums.length;i++){
        	for(int j=i+1;j<nums.length;j++){
        		if((nums[i]+nums[j])==target){
        			results[0]=i;
        			results[1]=j;
        		}else{
        			continue;
        		}
        	}
            
        }
        
        return results;
    }
public static int[] twoSum2(int[] nums, int target) {
		
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++){
		  int complement = target - nums[i];
		    if (map.containsKey(complement)){
		         return new int[] { map.get(complement), i };
		      }
		        map.put(nums[i], i);
		    }
		    throw new IllegalArgumentException("No two sum solution");
		
	}