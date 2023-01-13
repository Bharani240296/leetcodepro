package com.queue;

import java.util.LinkedList;
import java.util.Queue;

/*
Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).

Implement the MyStack class:

    void push(int x) Pushes element x to the top of the stack.
    int pop() Removes the element on the top of the stack and returns it.
    int top() Returns the element on the top of the stack.
    boolean empty() Returns true if the stack is empty, false otherwise.

Constraints:

    1 <= x <= 9
    At most 100 calls will be made to push, pop, top, and empty.
    All the calls to pop and top are valid.

 */
class MyStack
{
    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack()
    {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }
    public void push(int x)
    {
        //Add value in q2
        q2.add(x);

        //check q1 is not empty and then add q2 top elements in q1
        while(!q1.isEmpty())
        {
            q2.add(q1.peek());
            q1.remove();
        }

        //swap two q1 and q2
        Queue<Integer> q=q1;
        q1=q2;
        q2=q;
    }
    public int pop()
    {
        //check q1 is not empty to remove top element of the queue
        if(!q1.isEmpty())
        {
            return q1.remove();
        }
        return -1;
    }
    public int peek()
    {
        if(!q1.isEmpty())
        {
            return q1.peek();
        }
        return -1;
    }
    public boolean empty()
    {
        return q1.size()==0;
    }
}
public class Main {
    public static void main(String[] args) {
MyStack stack=new MyStack();
stack.push(1);
stack.push(2);
stack.push(3);
stack.push(4);
        System.out.println("Pop of the element: "+stack.pop());
        System.out.println("Peek of the element: "+stack.peek());
        System.out.println("Pop of the element: "+stack.pop());

    }
}
