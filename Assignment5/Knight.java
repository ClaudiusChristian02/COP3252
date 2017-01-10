package assignment5;
import java.util.*;

public class Knight
{
 	private String knightname;
	private String knightweapon;
	private int knightHealth;
	public static final String DEFAULTNAME = "Claudius";
	public static final String DEFAULTWEAPON = "Sword";
	public static final int DEFAULTPOINT = 100;

	public Knight (String name, String weapon, int health)
	{
		knightname = name;
		knightweapon = weapon;
		knightHealth = health;
	}
	
	public void Knightprint()
	{
		System.out.println("Knight's name is " + this.knightname);
		System.out.println("Knight's weapon is " + this.knightweapon);
		System.out.println("Knight's hitpoint is " + this.knightHealth);
	}
	
	public void setName( String name )
	{
		this.knightname = name;
	}
	
	public void setWeapon( String weapon )
	{
		this.knightweapon = weapon;
	}
	
	public void setHealth( int health )
	{
		this.knightHealth = health;
	}
	
	public String getName()
	{	
		return this.knightname;
	}
	
	public String getWeapon()
	{	
		return this.knightweapon;
	}
	
	public int getHealth()
	{
		return this.knightHealth;
	}
	
	public Knight ()
	{
		knightname = DEFAULTNAME;
		knightweapon = DEFAULTWEAPON;
		knightHealth = DEFAULTPOINT;
	}
	
	public void fight( EnemyAbstractSuperClass opponent )
	{
		
		int attackDamage;
		Random r = new Random();
		attackDamage = r.nextInt(36);
		
		opponent.health -= attackDamage;
		
		System.out.println("Damage caused is: " + attackDamage);
		
	} // end of public void attack( Knight k )
	
	public String toString()
	{
		
		String opponentName = "Knight: Weapon is ";
		

		return opponentName + this.knightweapon;
		
	} 
} // end of public class knight

