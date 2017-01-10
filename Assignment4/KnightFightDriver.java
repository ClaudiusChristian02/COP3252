package assignment4;

import java.util.Scanner;          // needed to read in user responses
import java.util.Random;           // needed to auto generate knight attributes

public class KnightFightDriver {

	private static int randomtHitPoints;

	public static void main( String[] args )
	{
		//Knight knight1 = new Knight( "Sir Jav-A-Lot", "2", 5, "y" );
		// String name, String weapon, int damage, String opponent
		//Knight knight = new Knight( "Napoleon", "1", "y", "9", "1,000,000");
		Scanner input = new Scanner( System.in );
		Random randomNumbers = new Random();
		int knightHitPoints    = 1,
			randomHitpoints    = 2,
		    randomKnightWeapon = 2;
		String y = "y";

		
		//*************************************************************************
		//                                 Knight Fight Welcome 
				

		// create knight object and assign it to myKnight
		System.out.print( "Welcome to the Knight Fight Game!" );
		
		

		//*************************************************************************
		//                                 Knight name 
		

		// create knight object and assign it to myKnight
		Knight myKnight = new Knight( nameOfKnight, randomKnightWeapon, knightHitPoints, "n");
		
		// create knight object and assign it to myKnight
		Knight opponentKnight = new Knight( nameOfKnight, randomKnightWeapon, knightHitPoints, "n");
		
		// prompt for and input knight name
		System.out.println( "\n\nPlease enter the knights name:" );
		
		// read a line of text
		String nameOfKnight = input.nextLine();
		
		// set the knight name
		myKnight.setKnightName( nameOfKnight );
	
		// outputs a blank line
		System.out.println();
		
		// call myKnight's knightName method and pass nameOfKnight as an 
		// argument initialized myKnight variable
		myKnight.knightName( nameOfKnight );

		//*************************************************************************
		//                                 Knight Fight Input 
		
		
		// Knight fight weapons selection directions
		System.out.println( "\n\nSelect a weapon by entering an integer between between" +
				            " 1-4:" );
		
		// print knight fight weapons options
		System.out.println( "\n" +
				            "1) Cuddly teddy bear\n" +
				            "2) Long Sword\n" +
				            "3) Warhammer\n" +
				            "4) Spear\n" +
				            "Your choice is: " );
		
		// read a line of text
		String knightsWeapon = input.nextLine();
		
		// set the knight name
		myKnight.setKnightWeapon( knightsWeapon );
	
		// outputs a blank line
		System.out.println();
		
		// call myKnight's knightName method and pass nameOfKnight as an 
		// argument initialized myKnight variable
		myKnight.knightWeapon( knightsWeapon );
	
		//*************************************************************************
		//                                 Knight Opponent 
		
		// print knight fight weapons options
		System.out.println( "\nWould you like to auto generate the hit points, " +
						    "and weapon of your opponent (y/n)? " );
				
		// read a line of text
		String autoOpponent = input.nextLine();
		
		// call myKnight's knightBattles method and pass knightBattles as an 
		// argument initialized myKnight variable
		myKnight.setKnightOpponent( autoOpponent );
		
		// determine if user selected auto generate opponents
		if( knight1.getKnightOpponent() == y  )
		{
			// loop runs once to generate opponent weapon and health
			for( int counter = 1; counter < 2; counter++ )
			{
				
				// randomly generate opponent hit points
				knightHitPoints = 1 + randomNumbers.nextInt( 100 ); 
				
				// randomly generate opponent hit points
				randomtHitPoints = 1 + randomNumbers.nextInt( 100 ); 
				
				// randomly generate weapon	
				randomKnightWeapon = 1 + randomNumbers.nextInt( 4 );
				
				// set the knights hit points
				myKnight.setautoKnightHitpoints( randomtHitPoints );
				
				// set the knights hit points
				myKnight.setKnightHitPoints( knightHitPoints );
				
				// set the knights weapon
				myKnight.setautoKnightWeapon( randomKnightWeapon );
					
			} // end of for( int counter = 0; counter == 1; counter++ )
		} // end of if( knightOpponent == y  )
		
		else
		{
			// prompt for and input knight name
			System.out.println( "\n\nEnter your opponents name: " );
			
			// read a line of text
			String opponentNameOfKnight = input.nextLine();
			
			// set the knight name
			myKnight.setautoKnightName( opponentNameOfKnight );
			
			// call myKnight's knightName method and pass nameOfKnight as an 
			// argument initialized myKnight variable
			myKnight.autoKnightName( opponentNameOfKnight );
		
		}
		
		// call myKnight's knightBattles method and pass knightBattles as an 
		// argument initialized myKnight variable
		myKnight.setKnightHitPoints( randomtHitPoints );
		
		//*************************************************************************
		//                                 Knight Summary 
		
		
		// print summary header for user knight data
		System.out.println( "\n\nThe user knights attributes are:\n\n" );
		
		// print default constructor if needed
		System.out.printf( knight1.getKnightName() );
		
		// print default constructor if needed
		System.out.printf( knight1.getKnightWeapon() );
		
		// print default constructor if needed
		System.out.println( knight1.getKnightHitPoints() );
		
		// print summary header for opponent knight data
		System.out.println( "\n\nThe opponent knights attributes are:\n\n" );
		
		// print default constructor if needed
		System.out.printf( knight1.getautoKnightName() );
		
		// print default constructor if needed
		System.out.println( knight1.getautoKnightWeapon() );
		
		// print default constructor if needed
		System.out.println( knight1.getKnightHitPoints() );
		
		
		
		// print default constructor if needed
		System.out.printf( knight1.getautoKnightName() );
		
		// print default constructor if needed
		System.out.print( knight1.getautoKnightWeapon() );
		
		// print default constructor if needed
		System.out.printf("Hit points: ", knight1.getautoKnightHitpoints() );
		
		
		/*
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
			  JOptionPane.showInputDialog( "\n\nPlease enter the knights gold:\n\n" );
		
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
		//                                 Set Method
		
		// how do I check for valid input with a set method in Java?
		// using only chapters 1-8 so if a valid input was entered do not select
		// the default in the constructor. 

		*/
	} // public static void main( String[] args )
} // end public class KnightDriver {