package assignment4;

public class Knight 
{
	
	//*************************************************************************
	//                                 Private Variable                       
	
	
	
	private String knightName;            // holds the knights name
	private String autoKnightName;        // holds the opponents name
	private String knightWeapon;          // holds the knights weapon
	private String knightOpponent;        // holds auto generate opponent choice 
	private int knightHitPoints;          // holds hit points
	private int autoKnightWeapon;         // holds auto generate weapon
	private int autoKnightHitpoints;      // holds auto generate hit points

	
	
	//*************************************************************************
	//                                 Constructors       	
	
	public Knight( String name, String weapon, int damage, String opponent ) 
	{
		knightName          = name;
		knightWeapon        = weapon;
		knightHitPoints     = damage;
		knightOpponent      = opponent;
		
	} // end of public Knight( String name, String weapon, int knightHitPoints, 
	  // int damage )

	public Knight( String autoName, int autoWeapon, int autoDamage, String opponent ) {
			knightName           = autoName;
			autoKnightWeapon     = autoWeapon;
			autoKnightHitpoints  = autoDamage;
			knightOpponent       = opponent;
			
		} // end of public Knight( String opponent, int autoKnightWeapon, 
	      // int autoKnightHitpoints  )
	
	//*************************************************************************
	//                                 Set Functions                          
		
	//************************
	// Set Name
	//************************

	// method to set the knight name
	public void setKnightName( String name )
	{
		// store the knight name
		knightName = name;
	} // end public void SetCourseName( String name )
	
	//************************
	// Set Opponents Name
	//************************

	// method to set the knight name
	public void setautoKnightName( String autoName )
	{
		// store the knight name
		autoKnightName = autoName;
	} // end public void SetCourseName( String name )
	
	//************************
	// Set Weapon
	//************************
	
	// method to set the knight health
	public void setKnightWeapon ( String weapon )
	{
		// store the knight health
		knightWeapon = weapon;
	} // end public void setKnightHealth ( String health )
	
	//************************
	// Set Opponent Choice
	//************************
	
	// method to set the knight battles
	public void setKnightOpponent ( String opponent )
	{
		// store the knight battles
		knightOpponent = opponent;
	} // end public void setKnightBattles ( String battles )
	
	//************************
	// Set HitPoints
	//************************

	// method to set the knight age
	public void setKnightHitPoints ( int damage )
	{
		// store the knight age
		knightHitPoints = damage;
	} // end public void setKnightage ( String age )
	
	//************************
	// Set autoKnightWeapon
	//************************
	
	// method to set the knight health
		public void setautoKnightWeapon ( int autoWeapon )
		{
			// store the knight health
			autoKnightWeapon = autoWeapon;
		} // end public void setKnightHealth ( String health )
	
	//************************
	// Set autoKnightHitPoints
	//************************
	
	// method to set the knight health
		public void setautoKnightHitpoints ( int autoDamage )
		{
			// store the knight health
			autoKnightHitpoints = autoDamage;
		} // end public void setKnightHealth ( String health )

	
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
	// Get Opponents Name
	//**********************
	
	// method to retrieve the knights name
	public String getautoKnightName()
	{
		return autoKnightName;
	} // end public String getKnightName()
	
	//**********************
	// Get knightHitPoints
	//**********************
	
	// method to retrieve the knights age
	public int getknightHitPoints()
	{
		return knightHitPoints;
	} // end public String getKnightAge()
	
	//**********************
	// Get knightWeapon
	//**********************
	
	// method to retrieve the knights age
	public String getKnightWeapon()
	{
		return knightWeapon;
	} // end public String getKnightAge()
	
	//************************
	// Get autoKnightWeapon
	//************************
	
	// method to retrieve the knights gold
	public String getKnightOpponent()
	{
		return knightOpponent;
	} // end public String getKnightGold()
	
	//************************
	// Get autoKnightWeapon
	//************************
	
	// method to retrieve the knights gold
	public int getautoKnightWeapon()
	{
		return autoKnightWeapon;
	} // end public String getKnightGold()
	
	//************************
	// Get User Knight Hit Points
	//************************
	
	// method to retrieve the auto knight hit points
	public int getKnightHitPoints()
	{
		return knightHitPoints;
	} // end public int getautoKnightHitpoints()
	
	//************************
	// Get autoKnightHitpoints
	//************************
	
	// method to retrieve the auto knight hit points
	public int getautoKnightHitpoints()
	{
		return autoKnightHitpoints;
	} // end public int getautoKnightHitpoints()
	
	

	
	//**************************************************************************
	//                                 Print Knight Name Function
	
	// display the knights name to the user
	public void knightName( String knightName )
	{
		
		System.out.printf( "The knights name is %s", knightName);
	} // end public void knightName( String knightName )
	
	
	//**************************************************************************
	//                                 Print Knight Weapon
	
	// display the knights health to the user
	public void knightWeapon( String knightWeapon )
	{
		
		System.out.printf( "The knights weapon is %s", knightWeapon);
	} // end public void knightHealth( String knightHealth )
	
	//**************************************************************************
	//                                 Print Knight Weapon
	
	// display the knights health to the user
	public void autoKnightWeapon( int autoKnightWeapon )
	{
		
		System.out.printf( "The auto generated knights weapon is %d", autoKnightWeapon);
	} // end public void knightHealth( String knightHealth )
	
	//**************************************************************************
	//                                 Print Knight Weapon
	
	// display the knights hit points to the user
	public void KnightHitpoints( int KnightHitpoints )
	{
		
		System.out.printf( "The knights weapon is %d", KnightHitpoints);
	} // end public void knightHealth( String knightHealth )
		
	// display the knights hit points to the user
	public void autoKnightHitpoints( int autoKnightHitpoints )
	{
		
		System.out.printf( "The knights weapon is %d", autoKnightHitpoints);
	} // end public void knightHealth( String knightHealth )

	public void autoKnightName(String autoKnightName) 
	{
		
		System.out.printf( "The opponents name is %s", autoKnightName);
		
	}
	
} // end public class Knight


