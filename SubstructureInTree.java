/*
面试题18：树的子结构
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

public class SubstructureInTree{
    public boolean hasSubtree(BinaryTreeNode root1, BinaryTreeNode root2){
        boolean result = false;

        if(root1 != null && root2 != null){
            if(root1.value == root2.value)
                result = doesTree1haveTree2(root1, root2);
            if(!result)
                result = hasSubtree(root1.left, root2);
            if(!result)
                result = hasSubtree(root1.right, root2);
        }
        return result;
    }

    private boolean doesTree1haveTree2(BinaryTreeNode root1, BinaryTreeNode root2){
        if(root2 == null)
            return true;
        if(root1 == null)
            return false;
        if(root1.value != root2.value)
            return false;

        return doesTree1haveTree2(root1.left, root2.left) && doesTree1haveTree2(root1.right, root2.right);

    }

}