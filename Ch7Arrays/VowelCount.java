/*
   Write a static method named vowelCount that accepts a String as a parameter and returns an array of integers representing the counts of each vowel in the String. 
   The array returned by your method should hold 5 elements: the first is the count of As,
   the second is the count of Es, the third Is, the fourth Os, and the fifth Us.
   Assume that the string contains no uppercase letters.

   For example, the call vowelCount("i think, therefore i am") should return the array {1, 3, 3, 1, 0}.
*/

public class VowelCount
{
   public static void main(String[] args)
   {
      String testSentence = "i think, therefore i am";
      int[] result = vowelCount(testSentence);
      
      for(int i = 0; i < result.length; i++)
      {
         System.out.print(result[i] + " ");
      }
   }
   
   public static int[] vowelCount(String sentence)
   {
      int[] counts = new int[5];
      
      for(int i = 0; i < sentence.length(); i++)
      {
         char letter = sentence.charAt(i);
         
         if(letter == 'a')
         {
            counts[0]++;
         }
         else if(letter == 'e')
         {
            counts[1]++;
         }
         else if(letter == 'i')
         {
            counts[2]++;
         }
         else if(letter == 'o')
         {
            counts[3]++;
         }
         else if(letter == 'u')
         {
            counts[4]++;
         }
      }
          
      return counts;        
   }   
}
