/*
面试题19：二叉树的镜像
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

public class MirrorOfBinaryTree{
    public void mirrorRecursively(BinaryTreeNode root){
        if(root == null || (root.left == null && root.right == null))
            return;
        BinaryTreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        if(root.left != null)
            mirrorRecursively(root.left);
        if(root.right != null)
            mirrorRecursively(root.right);
    }

}