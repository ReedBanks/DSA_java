package trees;

public class MaxBin {
    // finding the max value in a binary tree

//Algorithm
//find max of left and right tree
// compare both values with root
// return max value

       public int  maxValue(Main_Bin_Tree.TreeNode root){
           if(root == null)return Integer.MIN_VALUE;
           int result=root.data;
           int left=maxValue(root.left);
           int right=maxValue(root.right);
           if(left > right){
               result=left;
           } else if (right>left) {
               result=right;
           }

    return result;
       }

    public static void main(String[] args) {
        //obj of main tree && others
        Main_Bin_Tree tree=new Main_Bin_Tree();
        MaxBin rt=new MaxBin();
        tree.createTree();
        System.out.println("Max value : "+rt.maxValue(tree.root));

    }

}
