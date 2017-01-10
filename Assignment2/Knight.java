//*************************************************************************************************************************************************************
/*                                                                       Assignment 2                                                                         */

/*
Christian, Claudius
COP-3252
Assignment 2
1/24/2013
*/

//*************************************************************************************************************************************************************
/*                                                                       Description                                                                          */
/*
 
Create a fictional character from the land of Camelot. Our character will be a knight from the round table who you can name what you wish. We'll need to know 
a few things about our knight such as his name(hint:String), health(hint:int), number of battles, age, and amount of gold procured from pillaging. To keep 
track of all of these attributes, we'll need to create a container to hold each of the specified pieces of information above. Criteria:

1. This is to be a command line interface only.
2. 
*/
 
//*************************************************************************************************************************************************************
/*                                                                       Input                                                                                */
/*

To populate each of these containers, we'll need to have a way of entering data from the user.
*/

//*************************************************************************************************************************************************************
/*                                                                       Assumptions                                                                          */
/*

This program has no error checking, and therefore presumes that the user will enter valid information when prompted.
*/

//*************************************************************************************************************************************************************
/*                                                                       Output                                                                               */
/*

Output must be displayed using the printf method. To get an overall picture of your knight, we'll need a way to export all of these attributes to the screen. 
Output:

1. name
2. health
3. number of battles
4. age
5. amount of gold procured from pillaging
*/

//*************************************************************************************************************************************************************
/*                                                                       Headers                                                                              */

// reads in user data
import java.util.Scanner;                         

//*************************************************************************************************************************************************************
/*                                                                       Main                                                                                 */

public class Knight 
{
	
	// main method begins execution of Java application
	public static void main ( String[] args )
	{
		
		// print welcome message
		System.out.println ( "\n\n        ******   Welcome to Claudius' Assignment 2 ******" );
		
		// scanner obtains input from the command window
		Scanner input = new Scanner( System.in );
	
		
		int knightHealth;                       // stores the knights' health
		int knightTotalBattles;                 // stores the knight's total battles
		int knightAge;                          // stores the knights' age
		int knightGold;                         // stores the knights' gold
		
		
		//****************************************
		//  Knight Name  
		//****************************************
		
		//  print out message to get knight name                
		System.out.println( "\n\nEnter the name of your character\n with no spaces, or characters: ");
		
		// declare string variable, and read in the knight's name
		String knightName = input.nextLine();
		
		
		//****************************************
		//  Knight Health  
		//****************************************
		
		//  print out message to get knight health                
		System.out.println( "\nEnter the health of your character using only positive integers: ");
		
		// read in the knight's name
		knightHealth = input.nextInt();
		
		
		//****************************************
		//  Knight Battle Total  
		//****************************************
		
	    //  print out message to get knight total battles                
		System.out.println( "\nEnter the total battles of your character using only positive integers: ");
			
		// read in the knight's total battles
		knightTotalBattles = input.nextInt();
		
		
		//****************************************
		//  Knight Age  
		//****************************************
		
	    //  print out message to get knight age                
		System.out.println( "\nEnter the age of your character using only positive integers: ");
				
		// read in the knight's total age
		knightAge = input.nextInt();
		
		
		//****************************************
		//  Knight Gold  
		//****************************************
				
	    //  print out message to get knight gold                
		System.out.println( "\nEnter the gold of your character using only positive integers: ");
						
		// read in the knight's total gold
		knightGold = input.nextInt();
		
		
		//****************************************
		//  print out the data entered by the user  
		//****************************************	
		
		// print out the knights name
		System.out.printf ( "\n\nPlease check the following information you entered above for errors.");
		
		// print out the knights name
		System.out.printf ( "\n\nThe knights name is: %s", knightName);
		
		// print out the knights health
		System.out.printf ( "\n\nThe knights health is: %d", knightHealth);
		
		// print out the knights total battles
		System.out.printf ( "\n\nThe knights battle total is: %d", knightTotalBattles);
		
		// print out the knights age
		System.out.printf ( "\n\nThe knights age is: %d", knightAge);
		
		// print out the knights gold
		System.out.printf ( "\n\nThe knights gold is: %d", knightGold);
		
		
		//****************************************
		//  print out closing message  
		//****************************************	
		
		// ending message to the user
		System.out.println ( "\n\nThis program has ended normally.\n");
			
	} // end of main method
} // end of class knight
	
//*************************************************************************************************************************************************************
/*                                                                       End of Program                                                                       */
