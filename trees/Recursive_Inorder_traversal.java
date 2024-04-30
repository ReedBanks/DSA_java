package trees;

public class Recursive_Inorder_traversal {

// Left Node Right

    public void inOrder(Main_Bin_Tree.TreeNode root){
        if(root == null )return;
        inOrder(root.left);
        System.out.print(root.data+" -> ");
        inOrder(root.right);
        System.out.println(" null ");
    }

    public static void main(String[] args) {
        //obj of main tree && others
    Main_Bin_Tree tree=new Main_Bin_Tree();
    Recursive_Inorder_traversal rt=new Recursive_Inorder_traversal();
    tree.createTree();
    rt.inOrder(tree.root);

    }
}
