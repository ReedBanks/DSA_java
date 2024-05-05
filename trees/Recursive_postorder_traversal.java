package trees;

public class Recursive_postorder_traversal {
// traversal => left right node

    public void postOrder(Main_Bin_Tree.TreeNode root) {
        if (root == null) return;
        else {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " -> ");
        }
    }
    
public static void main(String[] args) {
    //obj of main tree && others
    Main_Bin_Tree tree=new Main_Bin_Tree();
    Recursive_postorder_traversal rt=new Recursive_postorder_traversal();
    tree.createTree();
    rt.postOrder(tree.root);

}

}
