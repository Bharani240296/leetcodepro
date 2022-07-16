package Tree.Binary_tree;

import java.util.ArrayList;
import java.util.List;

class TreeNodes
{
 int data;
 TreeNodes left;
 TreeNodes right;

 public TreeNodes() {
 }

 public TreeNodes(int data) {
  this.data = data;
 }
}
 class Preorder {
 TreeNodes root;
 public void preorder(TreeNodes root, List<Integer> list) //preorder(root,left,right)
 {
  if (root==null)
  {
   return;
  }
  list.add(root.data);
  preorder(root.left,list);
  preorder(root.right,list);
 }

  public static void main(String[] args) {
   Preorder preorder=new Preorder();
   preorder.root=new TreeNodes(1);
   preorder.root.left=new TreeNodes(2);
   preorder.root.right=new TreeNodes(3);
   List<Integer> list=new ArrayList<>();
   preorder.preorder(preorder.root,list);
   System.out.println(list);
  }
}
