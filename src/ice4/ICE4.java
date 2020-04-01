
package ice4;

import java.util.Scanner;

/**
 * This class +++Insert Description Here+++
 *
 * @author Will Agbonselobho
 */
public class ICE4 {
public static boolean method1 (String word, char character) {

int count = 0;
  
for (int i = 0; i < word.length(); i++) {
    if (word.charAt(i) == character) {
        count++; 
    }
}

System.out.println("Number of occurences of e :"+count);
return false;
}

public static void method2 (char[]array){
  
   int MaxChar = array[2];
   for(int i=0;i<array.length;i++){
    if(array[i]>MaxChar){
       MaxChar = array[i]; 
      
    }
}
   System.out.println("Maximum character is: "+ MaxChar);
}

    /**
     *
     * @return
     */
    public static boolean method3 (String word) {
     
     boolean isFound = word.contains("e");
     return true;
   }
    public static void main(String[] args) {
              
            String word = "telephone";
            char character ='a';
             char [] array= {'a','b','c'};
             method1(word,character);
             method2(array);
             method3(word);
         boolean isValid=false;
        do
        {
          System.out.println("letter not found in string");
            if (method3(word))
            {
               isValid=true;
            }
        }while(!isValid);
        System.out.println("Letter found!");
    }     
          
    }


