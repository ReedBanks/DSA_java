package trees;

import java.util.Stack;

public class iterative_Inorder_traversal {
    public void iterIndorder(Main_Bin_Tree.TreeNode root) {

        if (root == null)return;
       Stack<Main_Bin_Tree.TreeNode> stack =new Stack<>();
       Main_Bin_Tree.TreeNode temp=root;
       while (!stack.isEmpty() || temp != null){
           if(temp != null){
               stack.push(temp);
               temp=temp.left;
           }
           else{
               temp=stack.pop();
               System.out.print(temp.data + " -> ");
               temp=temp.right;
           }

       }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Main_Bin_Tree tree=new Main_Bin_Tree();
        iterative_Inorder_traversal rt=new iterative_Inorder_traversal();
        tree.createTree();
        rt.iterIndorder(tree.root);
    }
}
