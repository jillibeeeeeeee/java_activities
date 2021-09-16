import java.util.Scanner; 

public class ROT13Encryption {
	
  public static void main(String[] args) {
    
	Scanner sc = new Scanner(System.in);
    for(;;) {                                  
      System.out.print("Enter Data: ");                
      String line = sc.nextLine();   
      
      StringBuffer buf = new StringBuffer(line); 
      for(int i = 0; i < buf.length(); i++)      
        buf.setCharAt(i, rot13(buf.charAt(i)));  
      System.out.println("New Data: " +buf);  
      break;
    }
  }

  public static char rot13(char j) {
    if ((j >= 'A') && (j <= 'Z')) {  
      j += 13;                      
      if (j > 'Z') j -= 26;         
    }
    if ((j >= 'a') && (j <= 'z')) { 
      j += 13;
      if (j > 'z') j -= 26;
    }
    return j;                      
  }
}
