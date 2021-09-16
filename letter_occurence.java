// letter occurrence ignoring case sensitivity in characters

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class LetterOccurrence {
    public static void main(String[] args) {
       
    	String inputString;
        Scanner scanner = new Scanner(System.in);
        
      
        int count;
       
        System.out.println("Enter a string: ");
        
        inputString = scanner.nextLine().toLowerCase();
   
        System.out.println("Array Contents: ");

        HashMap<Character, Integer> map = new HashMap<>();
      
    
        for (char character : inputString.toCharArray()) {
          
            if (map.containsKey(character)) {
                count = map.get(character);
                map.put(character, count + 1);
            } else {
                map.put(character, 1);
            }
        }
     
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
