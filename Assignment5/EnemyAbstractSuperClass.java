package assignment5;

import java.util.Random;

public abstract class EnemyAbstractSuperClass 
{
	
	private static final String DEFAULTNAME = "Sarah";
	// returns the enemies health
	public int health = 0;
	public String name;	
	public String attackType;
	
	public EnemyAbstractSuperClass()
	{
		this.name = DEFAULTNAME;
		this.health = 100;
	}
	public EnemyAbstractSuperClass(String name)
	{
		this.name = name;
		this.health = 100;
	}
	public String getName()
	{
		return name;
	}
	public void setName( String name )
	{
		this.name = name;
	}
	//abstract superclass that fights with the Knight with the abstract method 
	// fight that must be overridden and returns an int for damage
	public abstract int fight(Knight myknight);
	
	// override to string that prints out object information
	public abstract String toString();
	
	
	// method that returns a random Enemy object	
	public static void getRandomEnemy()
	{
		
	} // end of public static class getRandomEnemy
	
	public int getHealth()
	{
		return this.health;
		
	} // end of public int gethealth() 
	
	// sets the enemies health
	public void setHealth( int health )
	{
		this.health = health;
		
	} // end of public int setHealth() 
} // end of public abstract class EnemyAbstractSuperClass

class Ogre extends EnemyAbstractSuperClass
{
	
	
	//abstract superclass that fights with the Knight with the abstract method 
	// fight that must be overridden and returns an int for damage
	public int fight( Knight myknight )
	{
		
		int damage;
		
		Random randomGenerator = new Random();
		int newNumber = randomGenerator.nextInt();
		
		// if the new number is odd
		if( newNumber % 2 != 0 )
		{
			this.attackType = "punch";
			
		} // end of if( newNumber % 2 != 0 )
		
		else
		{
			this.attackType = "bolder attack";
			
		} // end of else attack is odd
		
		// determines the type of attack
		if( this.attackType == "punch" )
		{
			damage = 10;		
		}
	    // bolder attack
		else
		{
			damage = 20;
		}
		
		myknight.setHealth(myknight.getHealth() - damage);
		
		return damage;
		
	} // end of public abstract class fight	
	
	public String toString()
	{
		
		String opponentName = "Ogre: ";
		String typeOfAttack;
		
		if( this.attackType == "punch")
		{
			typeOfAttack = "the type of attack is a punch attack.";
		}
		else
		{
			typeOfAttack = "the type of attack is a bolder attack.";
		}
		

		return opponentName + typeOfAttack + this.health;
		
	} // end of public String toString()

} // end of class Ogre extends EnemyAbstractSuperClass

class Sorcerer extends EnemyAbstractSuperClass
{
	public int fight( Knight myknight )
	{
		
		int damage;
		
		Random randomGenerator = new Random();
		int newNumber = randomGenerator.nextInt();
		
		// if the new number is odd
		if( newNumber % 2 != 0 )
		{
			this.attackType = "wand";
			
		} // end of if( newNumber % 2 != 0 )
		
		else
		{
			this.attackType = "magic attack";
			
		} // end of else attack is odd
		
		// determines the type of attack
		if( this.attackType == "wand" )
		{
			damage = 5;		
		}
	    // bolder attack
		else
		{
			damage = 35;
		}
		
		myknight.setHealth(myknight.getHealth() - damage);
		
		return damage;
		
	} // end of public abstract class fight	
	
	public String toString()
	{
		
		String opponentName = "Sorcerer: ";
		String typeOfAttack;
		
		if( this.attackType == "wand")
		{
			typeOfAttack = "the type of attack is a wand attack.";
		}
		else
		{
			typeOfAttack = "the type of attack is a magic attack.";
		}

		return opponentName + typeOfAttack + this.health;
		
	} // end of public String toString()
} // end of class Sorcerer extends EnemyAbstractSuperClass 

class Troll extends EnemyAbstractSuperClass
{
	public int fight( Knight myknight )
	{
		
		int damage;
		
		Random randomGenerator = new Random();
		int newNumber = randomGenerator.nextInt();
		
		// if the new number is odd
		if( newNumber % 2 != 0 )
		{
			this.attackType = "stomp";
			
		} // end of if( newNumber % 2 != 0 )
		
		else
		{
			this.attackType = "headlock attack";
			
		} // end of else attack is odd
		
		// determines the type of attack
		if( this.attackType == "stomp" )
		{
			damage = 15;		
		}
	    // bolder attack
		else
		{
			damage = 20;
		}
		
		myknight.setHealth(myknight.getHealth() - damage);
		
		return damage;
		
	} // end of public abstract class fight	
	
	public String toString()
	{
		
		String opponentName = "Troll: ";
		String typeOfAttack;
		
		if( this.attackType == "stomp")
		{
			typeOfAttack = "the type of attack is a stomp attack.";
		}
		else
		{
			typeOfAttack = "the type of attack is a headlock attack.";
		}

		return opponentName + typeOfAttack + this.health;
		
	} // end of public String toString()
}// end of class Troll extends EnemyAbstractSuperClass 3
