package trees;

public class BinSearchTree {
    // Binary Search tree is a sorted binary tree

    // Binary tree validation
    // 1. The left tree should have values less than the root
    // 2. The right tree should have values greater than the root
    // 3. Left and right trees should be binary trees
    // min < x > max
    

    // Key searching
    public int SearchAKey(Main_Bin_Tree.TreeNode root,int key){
        //base case
        if(root == null || root.data==key){

            return root.data;
        }
        if(root.data>key){

           return SearchAKey(root.left,key);
        }
        else{
           return SearchAKey(root.right,key);
        }
    }
    public static void main(String[] args) {
        //obj of main tree && others
        Main_Bin_Tree tree=new Main_Bin_Tree();
        tree.createTree();
        BinSearchTree search_a_key=new BinSearchTree();
        System.out.println("key : " + search_a_key.SearchAKey(tree.root, 3));

    }
}
