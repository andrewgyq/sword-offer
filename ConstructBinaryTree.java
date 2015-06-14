/*
面试题6：重建二叉树
输入二叉树前序遍历和中序遍历的结果，重建出该二叉树
*/
// 前序遍历序列{1,2,4,7,3,5,6,8}
// 中序遍历序列{4,7,2,1,5,3,8,6}

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

public class ConstructBinaryTree{
    public static void main(String[] args) {
        
    }
}