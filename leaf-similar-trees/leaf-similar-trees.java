/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution{//递归
	public boolean leafSimilar(TreeNode root1,TreeNode root2){
		List<Integer>leaves1=new ArrayList();
		List<Integer>leaves2=new ArrayList();
		dfs(root1,leaves1);
		dfs(root2,leaves2);
		return leaves1.equals(leaves2);
	}
	
	public void dfs(TreeNode node,List<Integer> leafValues){
		if(node!=null){
			if(node.left==null&&node.right==null)//叶子节点判断
				leafValues.add(node.val);
			dfs(node.left,leafValues);//深搜递归
			dfs(node.right,leafValues);
		}
	}
}
