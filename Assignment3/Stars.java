package Assignment3;

public class Stars {
	
	private String knightCharacter;
	private int knightRows;
	private int knightColumns;
	
	
	//*************************************************************************
	//                                 Constructors    	
	
	public Stars( String character, int columns, int rows) {
		knightCharacter = character;
		knightRows      = rows;
		knightColumns   = columns;
		}

		public Stars() {
		}
	
	//*************************************************************************
	//                                 Set Functions                          
			
	//**********************
	// Set character type
	//**********************
	
	// method to set the character type
	public void setknightCharacter( String character )
	{
		// store the character type
		knightCharacter = character;
		
	} // end public public void setknightCharacter( String character )
	
	//**********************
	// Set number of rows
	//**********************
	
	// method to set number of rows
	public void setknightRows( int rows )
	{
		// store the number of rows
		knightRows = rows;
		
	} // end public void setknightRows( int rows )
	
	//**********************
	// Set number of columns
	//**********************
	
	// method to set number of rows
	public void setknightColumns( int columns )
	{
		// store the number of rows
		knightColumns = columns;
		
	} // end public void setknightRows( int rows )
	
	             	
	//**************************************************************************
	//                                 Get Functions
	
	//**********************
	// Get character type
	//**********************
	
	// method to retrieve the knights name
	public String getknightCharacter()
	{
		return knightCharacter;
		
	} // end public String getKnightName()	
	
	//**********************
	// Get number of rows
	//**********************
	
	// method to retrieve the knights name
	public int getknightRows()
	{
		return knightRows;
		
	} // end public String getKnightName()
	
	//**********************
	// Get number of columns
	//**********************
	
	// method to retrieve the knights name
	public int getknightColumns()
	{
		return knightColumns;
		
	} // end public String getKnightName()

	
	//**************************************************************************
	//                                 Print Knight Name Function
	
	//**********************
	// Get number of rows
	//**********************
	
	// display the knights name to the user
	public void knightCharacter( String knightCharacter )
	{
		
		System.out.printf( " %s", knightCharacter);
		
	} // end public void knightName( String knightName )                        
	
	//**********************
	// Get number of rows
	//**********************
	
	// display the knights name to the user
	public void knightRows( int numberOfRows )
	{
		
		System.out.printf( " %d", numberOfRows );
		
	} // end public void knightName( String knightName )
	
	//**********************
	// Get number of columns
	//**********************
	
	// display the knights name to the user
	public void knightColumns( int numberOfColumns )
	{
		
		System.out.printf( " %d", numberOfColumns );
		
	} // end public void knightName( String knightName )
	
	//*************************************************************************
	//                                 Print Star Field
	


}
