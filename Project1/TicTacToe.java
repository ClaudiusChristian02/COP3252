package ticTacToe;

import java.util.Scanner;  // used to read in user input

//declare array named board
public class TicTacToe {
	
	// initialize a string array called board
	private String board[];
	
	// create constructor called TicTacToe()
	public TicTacToe()
	{
		// board array has an index of 10
		board = new String[ 10 ];
		
	}
	public void gameBoard()	
	{
		// prints line for spacing
		System.out.println();
		
		// for loop to read through the board array
		for( int i =  0; i < board.length; i++ )
		{
			board[ i ] = "  ";
			
		} // end of for( int i =  0; i < board.length; i++ )
		
		// prints the top vertical lines to create the board
		System.out.println( "   " + board[ 1 ] + "   |   " + board[ 2 ] + "   |   " 
		                   + board[ 3 ] );
		
		// prints top most horizontal line to create the board
		System.out.println( "____________________________");
		
		// prints the middle vertical lines to create the board
		System.out.println( "   " + board[ 4 ] + "   |   " + board[ 5 ] + "   |   " 
                + board[ 6 ] );
		
		// prints the second horizontal line to create the board
		System.out.println( "____________________________");
		
		// prints the middle vertical lines to create the board
		System.out.println( "   " + board[ 7 ] + "   |   " + board[ 8 ] + "   |   " 
                + board[ 9 ] );
		
	} // end of public void gameBoard() 
	
	public void example()	
	{
		// prints line for spacing
		System.out.println();
		
		// for loop to read through the board array
		for( int i =  0; i < board.length; i++ )
		{
			board[ i ] = " X ";
			
		} // end of for( int i =  0; i < board.length; i++ )
		
		// prints the top vertical lines to create the board
		System.out.println( "   " + 1 + "   |   " + 2 + "   |   " 
		                   + 3 );
		
		// prints top most horizontal line to create the board
		System.out.println( "________________________");
		
		// prints the middle vertical lines to create the board
		System.out.println( "   " + 4 + "   |   " + 5 + "   |   " 
                + 6 );
		
		// prints the second horizontal line to create the board
		System.out.println( "________________________");
		
		// prints the middle vertical lines to create the board
		System.out.println( "   " + 7 + "   |   " + 8 + "   |   " 
                + 9 );
		
	} // end of public void example()
	
	public void spotPlayerTwo( int spot )
	{
		switch( spot )
		{
		case 1:
			board[ 1 ] = " O ";
			break;
		case 2:
			board[ 2 ] = " O ";
			break;
		case 3:
			board[ 3 ] = " O ";
			break;
		case 4:
			board[ 4 ] = " O ";
			break;
		case 5:
			board[ 5 ] = " O ";
			break;
		case 6:
			board[ 6 ] = " O ";
			break;
		case 7:
			board[ 7 ] = " O ";
			break;
		case 8:
			board[ 8 ] = " O ";
			break;
		case 9:
			board[ 9 ] = " O ";
			break;
			
		} // end of switch( spot )	
	} // end of public void spotPlayerTwo( int spot )
	
	public void spotPlayerOne( int spot )
	{
		switch( spot )
		{
		case 1:
			board[ 1 ] = " X ";
			break;
		case 2:
			board[ 2 ] = " X ";
			break;
		case 3:
			board[ 3 ] = " X ";
			break;
		case 4:
			board[ 4 ] = " X ";
			break;
		case 5:
			board[ 5 ] = " X ";
			break;
		case 6:
			board[ 6 ] = " X ";
			break;
		case 7:
			board[ 7 ] = " X ";
			break;
		case 8:
			board[ 8 ] = " X ";
			break;
		case 9:
			board[ 9 ] = " X ";
			break;
			
		} // end of switch( spot )	
	} // end of public void spotPlayerTwo( int spot )
	
	public boolean playerOneWin()
	{
		if( (board[ 1 ] == "X") && (board[ 2 ] == "X") && (board[ 3 ] == "X") )
		{
			return true;
		} // end of if( (board[ 1 ] == "X") && (board[ 2 ] == "X") && (board[ 3 ] == "X") )
		
		else if( (board[ 4 ] == "X") && (board[ 5 ] == "X") && (board[ 6 ] == "X") )
		{
			return true;
		} // end of if( (board[ 4 ] == "X") && (board[ 5 ] == "X") && (board[ 6 ] == "X") ) 
		
		else if( (board[ 7 ] == "X") && (board[ 8 ] == "X") && (board[ 9 ] == "X") )
		{
			return true;
		} // end of if( (board[ 7 ] == "X") && (board[ 8 ] == "X") && (board[ 9 ] == "X") )
		
		else if( (board[ 1 ] == "X") && (board[ 4 ] == "X") && (board[ 7 ] == "X") )
		{
			return true;
		} // end of if( (board[ 1 ] == "X") && (board[ 4 ] == "X") && (board[ 7 ] == "X") )
		
		else if( (board[ 2 ] == "X") && (board[ 5 ] == "X") && (board[ 8 ] == "X") )
		{
			return true;
		} // end of if( (board[ 2 ] == "X") && (board[ 5 ] == "X") && (board[ 8 ] == "X") )
		
		else if( (board[ 3 ] == "X") && (board[ 6 ] == "X") && (board[ 9 ] == "X") )
		{
			return true;
		} // end of if( (board[ 3 ] == "X") && (board[ 6 ] == "X") && (board[ 9 ] == "X") )
		
		else if( (board[ 1 ] == "X") && (board[ 5 ] == "X") && (board[ 9 ] == "X") )
		{
			return true;
		}// end of if( (board[ 1 ] == "X") && (board[ 5 ] == "X") && (board[ 9 ] == "X") )
		
		else if( (board[ 7 ] == "X") && (board[ 5 ] == "X") && (board[ 9 ] == "X") )
		{
			return true;
		} // end of if( (board[ 7 ] == "X") && (board[ 5 ] == "X") && (board[ 9 ] == "X") )
		
		return false;
	} // end of public boolean playerOneWin()
	
	public boolean playerTwoWin()
	{
		if( (board[ 1 ] == "X") && (board[ 2 ] == "X") && (board[ 3 ] == "X") )
		{
			return true;
		} // end of if( (board[ 1 ] == "X") && (board[ 2 ] == "X") && (board[ 3 ] == "X") )
		
		else if( (board[ 4 ] == "X") && (board[ 5 ] == "X") && (board[ 6 ] == "X") )
		{
			return true;
		} // end of if( (board[ 4 ] == "X") && (board[ 5 ] == "X") && (board[ 6 ] == "X") ) 
		
		else if( (board[ 7 ] == "X") && (board[ 8 ] == "X") && (board[ 9 ] == "X") )
		{
			return true;
		} // end of if( (board[ 7 ] == "X") && (board[ 8 ] == "X") && (board[ 9 ] == "X") )
		
		else if( (board[ 1 ] == "X") && (board[ 4 ] == "X") && (board[ 7 ] == "X") )
		{
			return true;
		} // end of if( (board[ 1 ] == "X") && (board[ 4 ] == "X") && (board[ 7 ] == "X") )
		
		else if( (board[ 2 ] == "X") && (board[ 5 ] == "X") && (board[ 8 ] == "X") )
		{
			return true;
		} // end of if( (board[ 2 ] == "X") && (board[ 5 ] == "X") && (board[ 8 ] == "X") )
		
		else if( (board[ 3 ] == "X") && (board[ 6 ] == "X") && (board[ 9 ] == "X") )
		{
			return true;
		} // end of if( (board[ 3 ] == "X") && (board[ 6 ] == "X") && (board[ 9 ] == "X") )
		
		else if( (board[ 1 ] == "X") && (board[ 5 ] == "X") && (board[ 9 ] == "X") )
		{
			return true;
		}// end of if( (board[ 1 ] == "X") && (board[ 5 ] == "X") && (board[ 9 ] == "X") )
		
		else if( (board[ 7 ] == "X") && (board[ 5 ] == "X") && (board[ 9 ] == "X") )
		{
			return true;
		} // end of if( (board[ 7 ] == "X") && (board[ 5 ] == "X") && (board[ 9 ] == "X") )
		
		return false;
	} // end of public boolean playerTwoWin()
	
	public static void main(String[] args){
		 
		// creating constructor object TTT
		TicTacToe TTT = new TicTacToe();
		
		// create Scanner to obtain input from command window
		Scanner input = new Scanner( System.in ); 
		
		// prints header
		System.out.println( "Florida State University");
		
		// prints line for spacing
		System.out.println();
		
		// notify user 1 what their game piece is
		System.out.println( "Player 1 is X");
		
		// notify user 2 what their game piece is
		System.out.println( "Player 2 is O");
		
		// prints line for spacing
		System.out.println();
		
		// print method call for live tic tac toe board
		TTT.example();
		
		// prints line for spacing
		System.out.println();
		
		do{
			int number1,
			    number2;
			
			// print method call for live tic tac toe board
			TTT.gameBoard();
			
			// print out player 1 move instructions
			System.out.println( "Player ones move is (press 1 - 9): ");
			
			// read in player ones move
			number1 = input.nextInt();
			
			// print out player 2 move instructions
			System.out.println( "Player two move is (press 1 - 9): ");
			
			number2 = input.nextInt();
			
			// call method to make a player move
			TTT.spotPlayerOne(number1);
			
			// call method to make a player move
			TTT.spotPlayerTwo(number2);
			
		} while( !TTT.playerOneWin() || !TTT.playerTwoWin() );

		// prints line for spacing
		System.out.println();
				
		// prints line for spacing
		System.out.println();
		
		// print out footer with author name
		System.out.println( "By: Claudius Christian");
		
	} // end of public static void
} // end of public class TicTacToe