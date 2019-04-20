//递归
/***
前序遍历为：

(root node) (preorder of left branch) (preorder of right branch)
而后序遍历为：

(postorder of left branch) (postorder of right branch) (root node)
如果我们知道左分支有多少个结点，我们就可以对这些数组进行分组，并用递归生成树的每个分支。

***/
class Solution{
	public TreeNode constructFromPrePost(int[] pre,int[] post){
		int N=pre.length;
		if(N==0)return null;
		TreeNode root=new TreeNode(pre[0]);
		if(N==1)return root;
		
		int L=0;//存储左子树长度
		for(int i=0;i<N;i++)
			if(post[i]==pre[1])L=i+1;//确定左子树部分，前序的第二个元素一定是左子根节点
		
		root.left=constructFromPrePost(Arrays.copyOfRange(pre,1,L+1),
		                               Arrays.copyOfRange(post,0,L));
		root.right=constructFromPrePost(Arrays.copyOfRange(pre,L+1,N),
		                                Arrays.copyOfRange(post,L,N-1));//递归 空间上重开数组
		return root;
	}
//时间复杂度：O(N^2)其中 N是结点的数量。
//空间复杂度：O(N^2)
}

class Solution{//使用索引指代子数组 pre 和 post，而不是通过那些子数组的副本。
	int[]pre,post;
	public TreeNode constructFromPrePost(int[] pre,int[]post){
		this.pre=pre;
		this.post=post;
		return make(0,0,pre.length);
	}
	public TreeNode make(int i0,int i1,int N){
		if(N==0)return null;
		TreeNode root=new TreeNode(pre[i0]);
		if(N==1)return root;
		
		int L=1;
		for(;L<N;L++)
			if(post[i1+L-1]==pre[i0+1])
				break;
			
		root.left=make(i0+1,i1,L);
		root.right=make(i0+L+1,i1+L,N-1-L);
	return root;
	}
//时间复杂度：O(N^2)其中 N是结点的数量。
//空间复杂度：O(N)
}