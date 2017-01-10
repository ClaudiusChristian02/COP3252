package project2;
import java.util.Scanner;
import java.util.LinkedList;



public class JavaConsole {
	
	public static void main(String[] args){
		
		// create a new string object to read in the users input
		String userInput0 = new String();
		String userInput1 = new String();
		String userInput2 = new String();
		
		// create Scanner to obtain input from command window
		Scanner input = new Scanner( System.in );
		
		// create an object called echo
		Echo echo = new Echo();
		
		// user welcome message
		System.out.println("Welcome to Claudius' Command Console. Type a command.");
		do
		{
			userInput0 = input.next();
			// determines if the user wants to echo print 
			
			// determine if the user would like to exit the console
			if( userInput0.equals("exit") )
				break;
			
			if( userInput0.equals("echo") )
			{
				// stores the echo command the user would like to do
				userInput1 = input.next();
				
				// stores the characters the user would like to manipulate
				userInput2 = input.next();
			
				LinkedList<String> list;
				list = new LinkedList<String>();
				list.add(userInput1);
				list.add(userInput2);
				echo.action(list);
			} // end of if( userInput0.equals("echo") );
			
			if( userInput0.equals("cat") )
			{
				//System.out.println("In CAT IF statement.");
				// creates an object called cat
				Cat cat = new Cat();
				
				// reads in the command type
				userInput1 = input.next();
				
				// reads in the file name
				userInput2 = input.next();
				
				LinkedList<String> list;
				list = new LinkedList<String>();
				list.add(userInput1);
				list.add(userInput2);
				cat.action(list);
			} // end of if( userInput0.equals("cat") )
			
			if( userInput0.equals("wc") )
			{
				//System.out.println("In CAT IF statement.");
				// creates an object called cat
				Wc wc = new Wc();
				
				// reads in the command type
				userInput1 = input.next();
				
				// reads in the file name
				userInput2 = input.next();
				
				LinkedList<String> list;
				list = new LinkedList<String>();
				list.add(userInput1);
				list.add(userInput2);
				wc.action(list);
			} // end of if( userInput0.equals("cat") )
		}
		while(true);
		
		// Program closing message.
		System.out.println("The program has terminated successfully");
	
	} // end of public static void main(String[] args)	
} // end of public class JavaConsole
