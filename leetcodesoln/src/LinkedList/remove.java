package LinkedList;

import java.util.List;

class ListNode
{
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
    }
}
public class remove {
    ListNode head;
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if((head==null)&&(head.next==null))
        {
            return head;
        }
        int count=0;
        ListNode curr=head;
        while(curr!=null)
        {
            count++;
            curr=curr.next;
        }
        curr=head;
        if(count==n)
        {
            return head.next;
        }
        else
        {
            for(int i=0;i<count-n-1;i++)
            {
                curr=curr.next;
            }
            curr.next=curr.next.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node=new ListNode(1);
        node.next=new ListNode(2);

        int n=1;
        ListNode Node=removeNthFromEnd(node,n);
        while(Node!=null) {
            System.out.println(Node.data);
            Node = Node.next;
        }
    }
}
