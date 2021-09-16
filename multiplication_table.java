import java.util.Scanner;

public class MultiplicationTable
{
    private static Scanner input = new Scanner(System.in); // Used for taking users' input
    public static void main(String[] args) 
    {
    	char choice = ' ';	// to intialise the variable
    	while (choice != 'X' || choice !='x')  // A menu loop to stop premature program termination
    	{
	      	displayMenu();
	    	choice = getChoice();
	    	processChoice(choice);
    	}
    }
    public static void displayMenu()
	{
        System.out.println ( " ----------------------------------");
		System.out.println ( " [S]et Bounds");
		System.out.println ( " [V]iew");
		System.out.println ( " [M]ultiply");
		System.out.println ( " [X]Exit  " );
		System.out.println ( " ----------------------------------");
	}
    public static char getChoice()
	//----------------------------
	// Return the first character of the user's keyboard entry.
    {
	System.out.print ("Enter choice  >>  ");
	String choice = input.nextLine();
	char getChoice = ' ';	
	if( choice.length() > 0 )
	{
		getChoice = choice.charAt(0);
	}
		return getChoice;
    }
    public static void processChoice(char choice_)
    // Performs the required function.
    // Does nothing if the choice_ is invalid.
  
    {
	switch (choice_)
	{
    		case 'S':
    		case 's':
                     setbounds(); // Calls Prime Number Method
                     break;
    		case 'V':
            case 'v':
                     view();  // Calls Stamp Duty Method
                     break;
            case 'M':
            case 'm':
            	Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number of rows and columns: ");
                int size = sc.nextInt();
                int[][] table = new int[size][size];
                for(int i=0; i<table.length; i++){ // accesses rows
                    for(int j=0; j<table[i].length; j++){ // accesses columns
                        table[i][j] = (i+1)*(j+1);
                        break;
                    }}
                    
            case 'X':
            case 'x':
                     System.out.println ("Exiting the program... Thankyou");
                     System.exit(0);	// Exits the program
                     break;
            default:	// Default message for invalid char
                    System.out.println("Error! " + choice_ +
                                       " is not a valid menu option");
        }
    }
	
    
    private static void setbounds() {
		// TODO Auto-generated method stub
    	System.out.print("Enter the number of rows and columns: ");
        Scanner sc = null;
		int size = sc.nextInt();
        int[][] table = new int[size][size];
        for(int i=0; i<table.length; i++){ // accesses rows
            for(int j=0; j<table[i].length; j++){ // accesses columns
                table[i][j] = (i+1)*(j+1);
            }}
        }
	private int size;
	private int[][] table;
 // determine padding (get length of each digit in last cell)
    int len_per_col = Integer.toString(table[size-1][size-1]).length();
    // determine padding (get length of each digit in last row)
    /* 
    int[] len_per_col = new int[size];
    for(int i=0; i<table[size-1].length; i++){
        len_per_col[i] = Integer.toString(table[size-1][i]).length();
    }
    */
    // apply padding based on last row
    String[][] table_with_padding = new String[size][size];{
    for(int i=0; i<table.length; i++){ // accesses rows
        for(int j=0; j<table[i].length; j++){ // accesses columns
            String curr = Integer.toString(table[i][j]);
            while(curr.length()<len_per_col){
                curr = " "+curr;
            }
            table_with_padding[i][j] = curr;
        }
    }
    // display table
    for(int i=0; i<table.length; i++){ // accesses rows
        for(int j=0; j<table[i].length; j++){ // accesses columns
            System.out.print(table_with_padding[i][j]+" ");
        }
        System.out.println();
    }}
	private static void view() {
		// TODO Auto-generated method stub
		
	}


	{
    	
    }
}
