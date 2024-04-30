package trees;

public class Recursive_preorder_traversal {

    //node left right

    public void preOrder(Main_Bin_Tree.TreeNode root){
        if(root == null )return;
        System.out.print(root.data+" -> ");
        preOrder(root.left);
        preOrder(root.right);
        System.out.print(" null ");
    }

    public static void main(String[] args) {
        Main_Bin_Tree tree=new Main_Bin_Tree();
        Recursive_preorder_traversal rt=new Recursive_preorder_traversal();
        tree.createTree();
        rt.preOrder(tree.root);
    }
}
