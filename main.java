import java.lang.Math;
import java.util.Arrays;
public class main{
   public static int Count(String sentence, String word){
      int count = 0;
      sentence += " ";
      for (int k = 33; k <= 64; k++){
         sentence = sentence.replace(String.valueOf(Character.toChars(k)[0]), "");
      }
      char[] senarray = sentence.toCharArray();
      for (char words : senarray){
         if (Character.toString(words).equals(" ")){
            count++;
         }
      }
      String[] wordcol = new String [count];
      int counter = 0;
      int j = 0;
      for (int i = 0; i < senarray.length; i++){
         if (Character.toString(senarray[i]).equals(" ")){
            wordcol[j] = String.valueOf(Arrays.copyOfRange(senarray,counter,i));
            counter = i + 1;
            j++; 
         }
      }
      count = 0;
      for (String words : wordcol){
      ;
         if (words.toLowerCase().equals(word.toLowerCase())){
            count++;
         }
      
      }
      return count;
   }
}
