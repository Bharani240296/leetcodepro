package Tree;
class TreeNode
{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }
}
public class completebinaryTree {
    TreeNode root;
    public static int countNodes(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        int leftlevel=countNodes(root.left);
        int rightlevel=countNodes(root.right);
        return leftlevel+rightlevel+1;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        System.out.println(countNodes(root));
    }
}
