package Tree.BFS_Binary_tree;
import java.util.*;

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
public class leveltree {
    TreeNode root;
    public List<List<Integer>> levelOrder(TreeNode root)
    {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        Levelwise(root,list);
        return list;
    }
    private void Levelwise(TreeNode root, List<List<Integer>> list) {
        if (root==null)
        {
            return;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty())
        {
            int size= queue.size();
            List<Integer> list1=new ArrayList<>();
            while (size-->0)
            {
                TreeNode temp=queue.poll();
                int val=temp.data;
                if (temp.left!=null)
                {
                    queue.offer(temp.left);
                }
                if (temp.right!=null)
                {
                    queue.offer(temp.right);
                }
                list1.add(val);
            }
            list.add(list1);
        }
    }

    public static void main(String[] args) {
        leveltree tree=new leveltree();
        tree.root=new TreeNode(3);
        tree.root.left=new TreeNode(9);
        tree.root.right=new TreeNode(20);
        tree.root.right.left=new TreeNode(15);
        tree.root.right.right=new TreeNode(7);
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        tree.Levelwise(tree.root,list);
        System.out.println(list);
    }
}
