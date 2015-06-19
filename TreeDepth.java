/*
面试题39：二叉树的深度
*/

class BinaryTreeNode{
    int value;
    BinaryTreeNode left;
    BinaryTreeNode right;
    BinaryTreeNode(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class TreeDepth{
    public int treeDepth(BinaryTreeNode root){
        if(root == null)
            return 0;
        int left = treeDepth(root.left);
        int right = treeDepth(root.right);

        return (left > right) ? (left + 1) : (right + 1);
    }
}