/**
   2           11
  3 4         9 10 
 6 5 7   ^   7 6 10
4 1 8 3  |  4 1 8 3
**/
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] A = new int[triangle.size() + 1];
        
        for(int i = triangle.size() - 1; i >= 0; i--) {
            for(int j = 0; j < triangle.get(i).size(); j++) {
                A[j] = Math.min(A[j], A[j+1]) + triangle.get(i).get(j);
            }
        }
        return A[0];
    }
}