package trees;

import java.lang.management.ManagementFactory;
import java.util.Stack;

public class iterative_postOrder_traversal {

    // traversal => left right node
    public void iterpostOrder(Main_Bin_Tree.TreeNode root) {

        Main_Bin_Tree.TreeNode current=root;
        Stack<Main_Bin_Tree.TreeNode> stack=new Stack<>();
        while(current !=null || !stack.isEmpty()){
            if(current != null ){
                stack.push(current);
                current=current.left;
            }
            else{
                Main_Bin_Tree.TreeNode temp =stack.peek().right;
                if(temp == null){
                    temp=stack.pop();
                    System.out.print( temp.data + " -> ");
                    while(!stack.isEmpty() && temp==stack.peek().right  ){
                        temp=stack.pop();
                        System.out.print(temp.data +" -> ");
                    }
                }
                else{
                    current=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Main_Bin_Tree tree=new Main_Bin_Tree();
        iterative_postOrder_traversal rt=new iterative_postOrder_traversal();
        tree.createTree();
        rt.iterpostOrder(tree.root);
    }
}
