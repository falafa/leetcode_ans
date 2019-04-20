class Solution{
	Map<Integer,List<TreeNode>> m=new HashMap();
	
	public List<TreeNode>allPossibleFBT(int N) {
		if(!m.containsKey(N)){//防止重复计算
			List<TreeNode>ans=new LinkedList();
			if(N==1){
				ans.add(new TreeNode(0));//题设节点值为0
			}else if(N%2==1){
				for(int x=0;x<N;++x){
					int y=N-1-x;
					 for (TreeNode left: allPossibleFBT(x))//对左子树递归
						 for(Treenode right: allPossibleFBT(y)){//对右子树递归
							 TreeNode bns=new TreeNode(0);
							 bns.left=left;
							 bns.right=right;
							 ans.add(bns);//添加当前节点
						 }
				}
			}
			m.put(N,ans);//将已算过的进行缓存
		}
        return m.get(N);
    }

}