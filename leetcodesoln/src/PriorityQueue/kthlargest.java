package PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Stack;

public class kthlargest {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        int val = 0;

        Stack<Integer> stack = new Stack();
        for (int i = 0; i < nums1.length; i++) {
            stack.push(nums1[i]);
        }
        System.out.println(stack);
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2};
        int[] nums1={1};

    }
}
