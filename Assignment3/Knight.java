package Assignment3;

public class Knight 
{
	
	//*************************************************************************
	//                                 Private Variable                       
	
	
	// the knights name
	private String knightName;
	private String knightHealth;
	private String knightBattles;
	private String knightAge;
	private String knightGold;

	
	
	//*************************************************************************
	//                                 Constructors       	
	
	public Knight( String name, String health, String battles, String age,
		   String gold) {
		knightName    = name;
		knightHealth  = health;
		knightBattles = battles;
		knightAge     = age;
		knightGold    = gold;
	}

	public Knight() {
	}
	
	//*************************************************************************
	//                                 Set Functions                          
		
	//**********************
	// Set Name
	//**********************

	// method to set the knight name
	public void setKnightName( String name )
	{
		// store the knight name
		knightName = name;
	} // end public void SetCourseName( String name )
	
	//**********************
	// Set Health
	//**********************
	
	// method to set the knight health
	public void setKnightHealth ( String health )
	{
		// store the knight health
		knightHealth = health;
	} // end public void setKnightHealth ( String health )
	
	//**********************
	// Set Battles
	//**********************
	
	// method to set the knight battles
	public void setknightBattles ( String battles )
	{
		// store the knight battles
		knightBattles = battles;
	} // end public void setKnightBattles ( String battles )
	
	//**********************
	// Set Age
	//**********************

	// method to set the knight age
	public void setKnightAge ( String age )
	{
		// store the knight age
		knightAge = age;
	} // end public void setKnightage ( String age )	
	
	//**********************
	// SetGold
	//**********************
	
	// method to set the knight gold
	public void setKnightGold ( String gold )
	{
		// store the knight 
		knightGold = gold;
	} // end public void setKnightGold ( String gold )

	
	//**************************************************************************
	//                                 Get Functions
	
	//**********************
	// Get Name
	//**********************
	
	// method to retrieve the knights name
	public String getKnightName()
	{
		return knightName;
	} // end public String getKnightName()
	
	//**********************
	// Get Health
	//**********************
	
	// method to retrieve the knights health
	public String getKnightHealth()
	{
		return knightHealth;
	} // end public String getKnightHealth()
	
	//**********************
	// Get Battles
	//**********************
	
	// method to retrieve the knights battles
	public String getknightBattles()
	{
		return knightBattles;
	} // end public String getKnightBattles()
	
	//**********************
	// Get Age
	//**********************
	
	// method to retrieve the knights age
	public String getKnightAge()
	{
		return knightAge;
	} // end public String getKnightAge()
	
	//**********************
	// Get Gold
	//**********************
	
	// method to retrieve the knights gold
	public String getKnightGold()
	{
		return knightGold;
	} // end public String getKnightGold()

	
	//**************************************************************************
	//                                 Print Knight Name Function
	
	// display the knights name to the user
	public void knightName( String knightName )
	{
		
		System.out.printf( "The knights name is %s", knightName);
	} // end public void knightName( String knightName )
	
	
	//**************************************************************************
	//                                 Print Knight Health Function
	
	// display the knights health to the user
	public void knightHealth( String knightHealth )
	{
		
		System.out.printf( "The knights health is %s", knightHealth);
	} // end public void knightHealth( String knightHealth )
	
	//**************************************************************************
	//                                 Print Knight Battles Function
	
	// display the knights health to the user
	public void knightBattles( String knightBattles )
	{
		
		System.out.printf( "The knights battles is %s", knightBattles);
	} // end public void knightBattles( String knightBattles )
	
	
	//**************************************************************************
	//                                 Print Knight Age Function
	
	// display the knights age to the user
	public void knightAge( String knightAge )
	{
		
		System.out.printf( "The knights age is %s", knightAge);
	} // end public void knightBattles( String knightBattles )
	
	//**************************************************************************
	//                                 Print Knight Gold Function
	
	// display the knights gold to the user
	public void knightGold( String knightGold )
	{
		
		System.out.printf( "The knights gold is $%s", knightGold);
	} // end public void knightGold( String knightGold )
} // end public class Knight
