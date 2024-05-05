package trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOder_traversal {
//level order || breadth-first

    public void levelTraversal(Main_Bin_Tree.TreeNode root){
        if(root == null)return;
        Queue<Main_Bin_Tree.TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            Main_Bin_Tree.TreeNode temp=queue.poll() ;
            System.out.print(temp.data +" -> ");
            if(temp.left != null){
                queue.offer(temp.left);
            }
            if(temp.right != null ){
                queue.offer(temp.right);
            }
        }

    }

    public static void main(String[] args) {
        //obj of main tree && others
        Main_Bin_Tree tree=new Main_Bin_Tree();
        LevelOder_traversal rt=new LevelOder_traversal();
        tree.createTree();
        rt.levelTraversal(tree.root);

    }


}
