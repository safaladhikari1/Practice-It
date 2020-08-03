/*
   Write a method splitStack that takes a stack of integers as a parameter and splits it into negatives and non-negatives. 
   The numbers in the stack should be rearranged so that all the negatives appear on the bottom of the stack and all the non-negatives appear on the top. 
   
   You may use a single queue as auxiliary storage.
*/

import java.util.*;

public class SplitStack
{
   public static void main(String[] args)
   {
      Stack<Integer> myStack = new Stack<>();
      myStack.push(-4);
      myStack.push(8);
      myStack.push(-2);
      myStack.push(-34);
      myStack.push(7);
      
      System.out.println(myStack);
      
      splitStack(myStack);
      
      System.out.println(myStack);
               
   }
   
   public static void splitStack(Stack<Integer> stack)
   {
      Queue<Integer> tempQ = new LinkedList<Integer>();
      
      // empties the stack, adds the elements to the Q
      while(!stack.isEmpty())
      {
         tempQ.add(stack.pop());
      }
      
      // if element is negative, adds the element to stack
      // if element is positive, adds the element to itself.
      int queueSize = tempQ.size();
      
      for(int i=0; i<queueSize; i++)
      {
         if(tempQ.peek() < 0)
         {
            stack.push(tempQ.poll());
         }
         else
         {
            tempQ.add(tempQ.poll());
         }
      }
      
      // at this time Q only has positive elements
      // adds the positive element to the stack
      while(!tempQ.isEmpty())
      {
         stack.push(tempQ.poll());
      }
 
   }
}