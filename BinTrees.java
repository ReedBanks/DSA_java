import java.util.Stack;

public class BinTrees {
  /**
   * stores data in a heirachical structure
   * the parent is called root
   * the child of the without a child is called a leaf
   * binary tree tree is a tree where a node has 2 or no children
   * 
   * */

  private TreeNode root;
  public class TreeNode {
    private int data;

    private TreeNode left;
    private TreeNode right;

    TreeNode() {
      this.data = 0;
      this.left = null;
      this.right = null;
    }

    public TreeNode(int data) {
      this.data = data;
    }}

    public void CreateBinTree() {
      TreeNode first = new TreeNode(1);
      TreeNode sec = new TreeNode(2);
      TreeNode third = new TreeNode(3);
      TreeNode fourth = new TreeNode(4);
      TreeNode fifth = new TreeNode(5);
      TreeNode sixth = new TreeNode(6);
      TreeNode seventh = new TreeNode(7);

      root = first;
      first.left = sec;
      first.right = third;// sec <--first-->third

      sec.left = fourth;
      sec.right = fifth;

      third.left = sixth;
      third.right = seventh;
    }


  /** Tree traversals */

//  PREORDER => node,left,right
//  recursive
//
  public void RecursivePreorder_Traversal(TreeNode root){
    if(root==null){
      return;
    }
    System.out.print(root.data+" => ") ;
    RecursivePreorder_Traversal(root.left);
    RecursivePreorder_Traversal(root.right);
  }

//itertive
// we have to store the values while iterating so we use a stack so we can return the last inserted element
public void IterativePreorder_Traversal(TreeNode root) {
//  base case
    if(root == null){
    return;
  }
  Stack<TreeNode> t=new Stack<>();
  t.push(root);
  while(!t.isEmpty()){
    TreeNode temp=t.pop();
    System.out.print(temp.data+" => ");
    if(temp.right !=null){
      t.push(temp.right);
    }
    if(temp.left != null){
      t.push(temp.left);
    }
    System.out.println("null");
  }
}

//INORDER => left,node,right
//  RECURSIVE
public void RecursiveInoder_Traversal(TreeNode root){
    if(root == null)return;
  RecursiveInoder_Traversal(root.left);
  System.out.print(root.data+ " => ");
  RecursiveInoder_Traversal(root.right);
}

//ITERATIVE
public void IterativeInoder_Traversal(TreeNode root){
    if(root==null){
      return;
    }
//   when we are done we won't be able to access the
    Stack<TreeNode> t=new Stack<>();
    TreeNode temp=root;
    while(!t.isEmpty()){

      while(temp.left!=null){
        temp=temp.left;
        t.push(temp);
      }

    }
}

  public static void main(String[] args) {
BinTrees t=new BinTrees();
t.CreateBinTree();
//t.RecursivePreorder_Traversal(t.root);
t.IterativePreorder_Traversal(t.root);

  }

}