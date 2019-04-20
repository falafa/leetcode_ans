class Solution{
	public List<List<Integer>> generate(int numRows){
		List<List<Integer>>triangle=new ArrayList<List<Integer>>();
		//0行得0
		if(numRows==0){
			return triangle;
		}
		//第一行永远是1
		triangle.add(new ArrayList<>());
		triangle.get(0).add(1);
		
		for(int rowNums=1;rowNums<numRows;rowNums++){
			List<Integer> row=new ArrayList<>();
			List<Integer> preRow=triangle.get(rowNums-1);
			
			//行的第一个数永远是1
			row.add(1);
			//杨辉三角性质
			//每行出首尾元素外，其余元素的值等于上一行
			//方位于当前元素的左上与右上元素的值的和。
			for(int j=1;j<rowNums;j++){
				row.add(preRow.get(j-1)+preRow.get(j));
			}
			
			//行的最后一个元素永远是1
			row.add(1);
			
			triangle.add(row);
		}
		return triangle;
	}
}