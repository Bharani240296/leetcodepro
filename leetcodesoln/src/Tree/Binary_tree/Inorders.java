package Tree.Binary_tree;
import java.util.ArrayList;
import java.util.List;

class TreeNode
{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int data) {
        this.data = data;
    }
}
class Inorder {
    TreeNode root;
    public void Inorders(TreeNode root, List<Integer> list)     //Inorder(left,root,right)
    {
        if (root==null)
        {
            return;
        }
        Inorders(root.left,list);
        list.add(root.data);
        Inorders(root.right,list);
    }

    public static void main(String[] args) {
        Inorder order=new Inorder();
        order.root=new TreeNode(1);
        order.root.left=new TreeNode(2);
        order.root.right=new TreeNode(3);
        List<Integer> list=new ArrayList<>();
        order.Inorders(order.root,list);
        System.out.println(list);
    }
}

