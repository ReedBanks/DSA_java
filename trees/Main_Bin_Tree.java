package trees;

public class Main_Bin_Tree {

    public TreeNode root;

    public class TreeNode{
        public int data;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data){
            this.data=data;
        }

    }

    //creating binary tree

    public void createTree(){
        TreeNode first=new TreeNode(1);
        TreeNode sec=new TreeNode(2);
        TreeNode third=new TreeNode(3);
        TreeNode fourth=new TreeNode(4);
        TreeNode fifth=new TreeNode(5);
        TreeNode sixth=new TreeNode(6);
        TreeNode seventh=new TreeNode(7);

        root=first;
        first.left=sec;
        first.right=third;
        sec.left=fourth;
        sec.right=fifth;
        third.left=sixth;
        third.right=seventh;

    }

}
