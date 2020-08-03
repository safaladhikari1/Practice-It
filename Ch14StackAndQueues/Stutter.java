/*
   Write a method stutter that takes a stack of integers as a parameter and replaces every value in the stack with two occurrences of that value.
   For example, suppose the stack stores these values:
   bottom [3, 7, 1, 14, 9] top
   
   Then the stack should store these values after the method terminates:
   bottom [3, 3, 7, 7, 1, 1, 14, 14, 9, 9] top
   
   Notice that you must preserve the original order. In the original list the 9 was at the top and would have been popped first.
   In the new stack the two 9s would be the first values popped from the stack. 
   You may use a single queue as auxiliary storage to solve this problem.
*/

import java.util.*;

public class Stutter
{
   public static void main(String[] args)
   {
      Stack<Integer> myStack = new Stack<Integer>();
      myStack.push(3);
      myStack.push(7);
      myStack.push(1);
      myStack.push(14);
      myStack.push(9);
      
      System.out.println(myStack);
      
      stutter(myStack);
      
      System.out.println(myStack);
          
   }
   
   public static void stutter(Stack<Integer> stack)
   {
      Queue<Integer> myQueue = new LinkedList<Integer>();
      
      while(!stack.isEmpty())
      {
         int num = stack.pop();
         
         myQueue.add(num);
         myQueue.add(num);
      } 
      
      while(!myQueue.isEmpty())
      {
         stack.push(myQueue.poll());
      }
      
      while(!stack.isEmpty())
      {
         myQueue.add(stack.pop());
      }
      
      while(!myQueue.isEmpty())
      {
         stack.push(myQueue.poll());
      }  
   }
}