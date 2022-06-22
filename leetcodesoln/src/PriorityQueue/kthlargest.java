package PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class kthlargest {
    public static int large(int[] nums,int k)
    {
        PriorityQueue<Integer> queue=new PriorityQueue(Collections.reverseOrder());
        for (int i = 0; i<nums.length; i++)
        {
            queue.add(nums[i]);
        }
        int large=0;
        for(int i=0;i<k;i++)
        {
            large= queue.poll();
        }
        return large;
    }

    public static void main(String[] args) {
        int[] nums={3,2,1,5,6,4};
        int k=6;
        System.out.println(large(nums,k));
    }
}
