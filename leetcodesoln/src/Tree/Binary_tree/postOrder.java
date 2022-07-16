package Tree.Binary_tree;

import java.util.ArrayList;
import java.util.List;

class treeNode
{
    int data;
    treeNode left;
    treeNode right;

    public treeNode() {
    }

    public treeNode(int data) {
        this.data = data;
    }
}
public class postOrder {
    treeNode root;
    public void Postorder(treeNode root, List<Integer> list)  //Postorder(left,right,root)
    {
        if (root==null)
        {
            return;
        }
        Postorder(root.left,list);
        Postorder(root.right,list);
        list.add(root.data);
    }

    public static void main(String[] args) {
        postOrder postorder =new postOrder();
        postorder.root=new treeNode(1);
        postorder.root.left=new treeNode(2);
        postorder.root.right=new treeNode(3);
        List<Integer> list=new ArrayList<>();
        postorder.Postorder(postorder.root,list);
        System.out.println(list);
    }
}
