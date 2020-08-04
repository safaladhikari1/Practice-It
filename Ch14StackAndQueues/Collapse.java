/*
   Problem: https://practiceit.cs.washington.edu/problem/view/bjp5/chapter14/e4-collapse
*/

import java.util.*;

public class Collapse
{
   public static void main(String[] args)
   {
      Stack<Integer> myStack = new Stack<Integer>();
      myStack.push(7);
      myStack.push(2);
      myStack.push(8);
      myStack.push(9);
      myStack.push(4);
      myStack.push(13);
      myStack.push(7);
      myStack.push(1);
      myStack.push(9);
      //myStack.push(10);
      
      System.out.println(myStack);
      
      collapse(myStack);
      
      System.out.println(myStack);
         
   }
   
   public static void collapse(Stack<Integer> stack)
   {
      
      Queue<Integer> q = new LinkedList<Integer>();
      
      if(stack.size() % 2 != 0)
      {
         q.add(stack.pop());
      }
      
      while(!stack.isEmpty())
      {
         q.add(stack.pop() + stack.pop());
      }
      
      while(!q.isEmpty())
      {
         stack.push(q.poll());
      }
      
      while(!stack.isEmpty())
      {
         q.add(stack.pop());
      }
      
      while(!q.isEmpty())
      {
         stack.push(q.poll());
      }     
   }
}