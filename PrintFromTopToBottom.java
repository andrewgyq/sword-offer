/*
面试题23：从上往下打印二叉树
*/
import java.util.Queue;
import java.util.LinkedList;
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

public class PrintFromTopToBottom{
    public void printFromTopToBottom(BinaryTreeNode root){
        if(root == null)
            return;
        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        queue.offer(root);

        while(queue.size() > 0){
            BinaryTreeNode node = queue.peek();
            queue.poll();

            System.out.print(node.value);
            if(node.left != null)
                queue.offer(node.left);
            if(node.right != null)
                queue.offer(node.right);
        }
    }
}