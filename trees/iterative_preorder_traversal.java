package trees;

import java.util.Stack;

public class iterative_preorder_traversal {

    //implementing using stacks
//    -base case
//    -create stack && push node iteratively
    public void iterpredorder(Main_Bin_Tree.TreeNode root) {

        if (root == null)return;
        Stack<Main_Bin_Tree.TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Main_Bin_Tree.TreeNode temp = stack.pop();
            System.out.print(temp.data + " -> ");
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }
    public static void main(String[] args) {
        Main_Bin_Tree tree=new Main_Bin_Tree();
        iterative_preorder_traversal rt=new iterative_preorder_traversal();
        tree.createTree();
        rt.iterpredorder(tree.root);
    }
}
