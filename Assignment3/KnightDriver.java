package Assignment3;
import javax.swing.JOptionPane; 


public class KnightDriver {

	public static void main( String[] args )
	{
		Knight knight1 = new Knight( "Sir-Jav-Alot", "100", "1", "9", "1,000,000");
		Stars Stars1 = new Stars( "*", 10, 8 );
		
		

		//*************************************************************************
		//                                 Knight name 
		

		// create knight object and assign it to myKnight
		Knight myKnight = new Knight();
		
		// prompt for and input knight name
		String message0 =
		      JOptionPane.showInputDialog( "Please enter the knights name:" );
		
		// read a line of text
		String nameOfKnight = message0;
		
		// set the knight name
		myKnight.setKnightName( nameOfKnight );
	
		// outputs a blank line
		System.out.println();
		
		// call myKnight's knightName method and pass nameOfKnight as an 
		// argument initialized myKnight variable
		myKnight.knightName( nameOfKnight );
		
		// print default constructor if needed
		System.out.printf( knight1.getKnightName() );
		


		//*************************************************************************
		//                                 Knight Health 
		
		
		// prompt for and input knight name
		String message1 =
		      JOptionPane.showInputDialog( "\n\nPlease enter the knights health:" );
		
		// read a line of text
		String knightHealth = message1;
		
		// set the knight name
		myKnight.setKnightHealth( knightHealth );
	
		// outputs a blank line
		System.out.println();
		
		// call myKnight's knightName method and pass nameOfKnight as an 
		// argument initialized myKnight variable
		myKnight.knightHealth( knightHealth );
		
		// print default constructor if needed
		System.out.printf( knight1.getKnightHealth() );
		
		
		

		//*************************************************************************
		//                                 Knight Battles 
		
		
		// prompt for and input knight battles
		String message2 =
			  JOptionPane.showInputDialog( "\n\nPlease enter the knights battles:" );
		
		// read a line of text
		String knightBattles = message2;
		
		// set the knight battles
		myKnight.setknightBattles( knightBattles );
	
		// outputs a blank line
		System.out.println();
		
		// call myKnight's knightBattles method and pass knightBattles as an 
		// argument initialized myKnight variable
		myKnight.knightBattles( knightBattles );
		
		// print default constructor if needed
		System.out.printf( knight1.getknightBattles() );
		
		
		//*************************************************************************
		//                                 Knight Age 
		
		
		// prompt for and input knight age
		String message3 =
			  JOptionPane.showInputDialog( "\n\nPlease enter the knights age:" );
		
		// read a line of text
		String knightAge = message3;
		
		// set the knight age
		myKnight.setKnightAge( knightAge );
	
		// outputs a blank line
		System.out.println();
		
		// call myKnight's knightAge method and pass knightAge as an 
		// argument initialized myKnight variable
		myKnight.knightAge( knightAge );
		
		// print default constructor if needed
		System.out.printf( knight1.getKnightAge() );
		
		//*************************************************************************
		//                                 Knight Gold 
		
		
		// prompt for and input knight gold
		String message4 =
			  JOptionPane.showInputDialog( "\n\nPlease enter the knights gold:" );
		
		// read a line of text
		String knightGold = message4;
		
		// set the knight gold
		myKnight.setKnightGold( knightGold );
	
		// outputs a blank line
		System.out.println();
		
		// call myKnight's knightGold method and pass knightGold as an 
		// argument initialized myKnight variable
		myKnight.knightGold( knightGold );
		
		// print default constructor if needed
		System.out.printf( knight1.getKnightGold() );
		

		
		//*************************************************************************
		//                                 Knight Stars 

		
		// create knight object and assign it to myKnight
		Stars myStars = new Stars();
		
		// prompt for and input knight name
		String message5 =
		      JOptionPane.showInputDialog( "Please enter a character:" );
		
		// read a line of text
		String typeOfCharacter = message5;
		
		// set the knight name
		myStars.setknightCharacter( typeOfCharacter );
		
		// outputs a blank line
		System.out.println();
	
		
		// call myKnight's knightName method and pass nameOfKnight as an 
		// argument initialized myKnight variable
		//myStars.knightCharacter( typeOfCharacter );
			

		//*************************************************************************
		//                                 Knight Star Rows

		// prompt for and input number of rows
		String message62 = 
			  JOptionPane.showInputDialog( "Please enter number of rows:" );
		
		// turn message62 into an integer and assign it to message6
		int message6 = Integer.parseInt( message62 ); 
		
		// read in
		int numberOfRows = message6;

		// set the knight name
		myStars.setknightRows( numberOfRows );
		
		// outputs a blank line
		System.out.println();
	
		
		// call myKnight's knightName method and pass nameOfKnight as an 
		// argument initialized myKnight variable
		//myStars.knightRows( numberOfRows );
	
		//*************************************************************************
		//                                 Knight Star Columns
		
		// prompt for and input number of rows
		String message63 = 
			  JOptionPane.showInputDialog( "Please enter number of columns:" );
		
		// turn message62 into an integer and assign it to message6
	    int message7 = Integer.parseInt( message63 ); 
		
		// read in
		int numberOfColumns = message7;
		
		// set the knight name
		myStars.setknightColumns( numberOfColumns );
		
		// outputs a blank line
		System.out.println();
		
		
		// call myKnight's knightName method and pass nameOfKnight as an 
		// argument initialized myKnight variable
		//myStars.knightColumns( numberOfColumns );
		
		
		//*************************************************************************
		//                                 set function
		
		// how do I check for valid input with a set method in Java?
		// using only chapters 1-8 so if a valid input was entered do not select
		// the default in the constructor. 

		
		//*************************************************************************
		//                                 Print Star Field
		
		// calls print method
		print( Stars1.getknightRows(), Stars1.getknightColumns(), Stars1.getknightCharacter() );
		
	}
	
	private static void print( int getknightRows, int getknightColumns, String knightCharacter ) {
		
		// count control loop for rows
		for(int r = 1; r < getknightRows; r++) {
			
			// print new line after column end
			System.out.print("\n"); 
			
			// count control loop for columns
			for(int c = 1; c < getknightColumns; c++){
				
				// check to see if the row is odd
				if( r % 2 == 0){
			    
				// if row is even print space before character
				System.out.print( " " ); 
				System.out.print( knightCharacter );
				}
				else
					
					// if row is odd print space before character
					System.out.print( knightCharacter + " " );
				}
			}
		}
} // end public class KnightDriver {
