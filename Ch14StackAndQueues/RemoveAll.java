import java.util.*;

public class RemoveAll
{
   // this method accepts a queue of strings and a target string
   // as parameters and removes all occurrences of the target string from
   // the queue.
   
   public static void main(String[] args)
   {
      Stack<Integer> stack = new Stack<Integer>();
      
      stack.push(50);
      stack.push(40);
      stack.push(10);
      stack.push(20);
      stack.push(10);
      
      System.out.println(stack);
      
      System.out.println(isSorted(stack));
      
      System.out.println(stack);
                
      Queue<String> queue = new LinkedList<String>();
      queue.add("a");
      queue.add("b");
      queue.add("c");
      queue.add("a");
      queue.add("c");
      queue.add("a");
      queue.add("b");
      queue.add("a");
      queue.add("a");
      
      //System.out.println(queue);
      
      //removeAll(queue, "a");
      
      //System.out.println(queue);
               
   }
   
   // [50, 40, 30, 20, 10]
   
   // [50, 40, 30, 20]
   // prev = 10
   public static boolean isSorted(Stack<Integer> stack)
   {
      if(stack.isEmpty())
      {
         return true;
      }
      
      Stack<Integer> backUp = new Stack<Integer>();
          
      int prev = stack.pop();
      backUp.push(prev);
      
      boolean sorted = true;
      
      while(!stack.isEmpty() && sorted)
      {
         if(stack.peek() < prev)
         {
            sorted =  false; // out of order, not sorted
         }
         else
         {
            prev = stack.pop();
            backUp.push(prev);
         }        
      }
      
      // restore from backup     
      while(!backUp.isEmpty())
      {
         stack.push(backUp.pop());
      }
      
      return sorted;        
   } 
   
   // [a, b, c, a, c, a, b, a, a]
   // element = "a"
   public static void removeAll(Queue<String> queue, String target)
   {
      int queueSize = queue.size();
      
      for(int i=0; i<queueSize; i++)
      {
         String element = queue.remove();
         
         if(!element.equals(target))
         {
            queue.add(element);
         }
      }
   }  
}