import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DigitSplitter {

public static void main(String args[]){
	
	int num;
	int num2;
	
	ArrayList<Integer> numberList = new ArrayList<Integer>();

    Scanner user_input = new Scanner( System.in );
    System.out.println("Enter the amount of numbers: ");

    num = user_input.nextInt();
    for (int i = 0; i < num; i++) {
        System.out.println("Enter a number: ");
        num2 = user_input.nextInt();
        numberList.add(num2);
    }

    Collections.sort(numberList, Collections.reverseOrder());
    for (int i = 0; i < numberList.size(); i++) {
        System.out.println(numberList.get(i));
    }
}
}
