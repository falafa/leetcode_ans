public boolean isSymmetric(TreeNode root) {//递归
    return isMirror(root, root);
}

public boolean isMirror(TreeNode t1, TreeNode t2) {
    if (t1 == null && t2 == null) return true;
    if (t1 == null || t2 == null) return false;
    return (t1.val == t2.val)
        && isMirror(t1.right, t2.left)
        && isMirror(t1.left, t2.right);
}
/**
如果同时满足下面的条件，两个树互为镜像：
1.它们的两个根结点具有相同的值。
2.每个树的右子树都与另一个树的左子树镜像对称。
**/

public boolean isSymmetric(TreeNode root) {//队列迭代
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    q.add(root);
    while (!q.isEmpty()) {
        TreeNode t1 = q.poll();
        TreeNode t2 = q.poll();
        if (t1 == null && t2 == null) continue;
        if (t1 == null || t2 == null) return false;
        if (t1.val != t2.val) return false;//队列中每两个连续的结点应该是相等的，而且它们的子树互为镜像。
        q.add(t1.left);//每次提取两个结点并比较它们的值。然后，将两个结点的左右子结点按相反的顺序插入队列中。
        q.add(t2.right);
        q.add(t1.right);
        q.add(t2.left);
    }
    return true;
}

