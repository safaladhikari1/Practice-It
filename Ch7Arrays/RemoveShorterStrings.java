/*
   Write a method removeShorterStrings that takes an ArrayList of Strings as a parameter and that removes from each successive pair of values the shorter string in the pair.
   For example, suppose that an ArrayList called list contains the following values:
   {"four", "score", "and", "seven", "years", "ago"} In the first pair, "four" and "score", the shorter string is "four". In the second pair, "and" and "seven", the shorter string is "and". In the third pair, "years" and "ago", the shorter string is "ago". Therefore, the call: 
   removeShorterStrings(list); should remove these shorter strings, leaving the list as follows: "score", "seven", "years". 
   If there is a tie (both strings have the same length), your method should remove the first string in the pair. If there is an odd number of strings in the list, the final value should be kept in the list.
*/

import java.util.*;

public class RemoveShorterStrings
{
   public static void main(String[] args)
   {
      ArrayList<String> testArray = new ArrayList<>();
      
      testArray.add("four");
      testArray.add("score");
      testArray.add("and");
      testArray.add("seven");
      testArray.add("years");
      testArray.add("ago");
      
      for(int i = 0; i < testArray.size(); i++)
      {
         System.out.print(testArray.get(i) + " ");
      }
      
      removeShorterStrings(testArray);
      
      System.out.println();
      for(int i = 0; i < testArray.size(); i++)
      {
         System.out.print(testArray.get(i) + " ");
      }           
   }
   
   public static void removeShorterStrings(ArrayList<String> list)
   {
      // loop through the array
      // get and compare the length of the string between
      // i and i+1 (1st and 2nd) (3rd and 4th)
      // store them in length1 and length2 variables      
      
      // if the lengths are equal
         // remove i
         
      // elseif length1 > length2
         // remove i+1
         
      // else remove i
      
      int endIndex = list.size() / 2;
              
      for(int i=0; i < endIndex; i++)
      {
         int length1 = list.get(i).length(); 
         int length2 = list.get(i+1).length();
         
         if(length1 == length2)
         {
            list.remove(i);
         }
         else if(length1 > length2)
         {
            list.remove(i+1);
         }
         else
         {
            list.remove(i);
         }         
      }      
   }
}