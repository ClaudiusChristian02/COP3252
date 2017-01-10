package assignment5;

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Driver {
	
	public static final String DEFAULTNAME = "Claudius";
	public static final String DEFAULTWEAPON = "Sword";
	public static final int DEFAULTHEALTH = 100;
	
	@SuppressWarnings("null")
	public static void main( String args[] )
	{
		String choice;
		String name;
		int weaponno;
		String weapon;
		String weaponlist[]={"DEFAULT", "Hammer", "Sword", "Axe"};
		int health = 0;
		boolean continueLoop = true;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome!");
		
		System.out.println("Would you like to auto generate your knights attributes? y/n: ");
		choice = scanner.next();
		
		Knight myknight;
		EnemyAbstractSuperClass enemy;
		
		if( choice.equals("y"))
		{
			myknight = new Knight();
			myknight.Knightprint();
		}
		else
		{
			System.out.println();
			System.out.println("Input the myknight's name:(If you enter auto, the name will be set to DEAFULTNAME)");
			name = scanner.next();
			if (name.equals("auto"))
				name = DEFAULTNAME;
			
			System.out.println();
			System.out.println("Input the myknight's weapon:(If you enter 0, the weapon will be set to DEAFULTWEAPON)");
			System.out.println("Here are the list of weapons:");
			for (int i=1; i<weaponlist.length; i++)
				System.out.println("(" + i + ")" + weaponlist[i]);
			//System.out.println("(1) Hammer");
			//System.out.println("(2) Sword");
			//System.out.println("(3) Axe");
			
		

			
			
			weaponno = scanner.nextInt();
			while (!(weaponno>=0 && weaponno<=3))
			{
				System.out.println("Invalid number. Re-enter a number in the range");
				weaponno = scanner.nextInt();
			}
			if (weaponno==0)
			{
				weapon = DEFAULTWEAPON;
			}
			else
			{
				weapon = weaponlist[weaponno];
			}
			
			
			do
			{
				try
				{
					System.out.println();
					System.out.println("Input the myknight's health:(If you enter 0, the health will be set to DEAFULTHEALTH)");
					health = scanner.nextInt();
					
					while(health<0)
					{
						System.out.println("Invalid number. Re-enter a number in the range");
						health = scanner.nextInt();
					}
					if (health==0)
						health = DEFAULTHEALTH;
					
					continueLoop = false;
				}
				catch( InputMismatchException inputMismatchException )
				{
					System.err.printf("\nException: %s\n", inputMismatchException );
					scanner.nextLine();
					System.out.println(" You must enter a number greater than zero (0).");
				}
				
			} while( continueLoop );
			
			myknight = new Knight(name, weapon, health);
			myknight.Knightprint();
			
		} // end else auto generate character
		
//================
// opponent
//================
		System.out.println();
		System.out.println("Would you like to auto generate your enemy attributes? y/n: ");
		choice = scanner.next();
		
		if( choice.equals("y"))
		{
			enemy = new Ogre(); 
		}
		
		else
		{
			System.out.println();
			System.out.println("Input the opponents name:(If you enter auto, the name will be set to DEAFULTNAME)");
			name = scanner.next();
			if (name.equals("auto"))
				name = DEFAULTNAME;
			// set the enemy name
			enemy = new Ogre();
			enemy.setName(name);
		} // end else auto generate character
		
		
		
			
		while( true )
		{
			
			System.out.println();
			System.out.println("It is " + myknight.getName() + " move.");
			
			
			myknight.fight( enemy );
			
			System.out.println("Your knights health is: " + myknight.getHealth() );
			System.out.println("Your opponents health is: " + enemy.getHealth() );
			
			if( (enemy.getHealth() < 0) )
			{
				System.out.println("The winner is: " + myknight.getName() );
				
				break;
			}
			
			System.out.println();
			System.out.println("It is " + enemy.getName() + " move.");
			/*int attacker;
			Random r = new Random();
			attacker = r.nextInt(3);
			
			if( attacker == 0 )
			enemy = new Ogre();
			if (attacker == 1)
			enemy = new Sorcerer();
			if (attacker == 2)
			enemy = new Troll();*/
			enemy.fight( myknight );
			
			//System.out.println("Your knights health is: " + myknight.getHealth() );
			//System.out.println("Your opponents health is: " + enemy.getHealth() );
			System.out.println( myknight );
			System.out.println( enemy );
			
			if( (myknight.getHealth() < 0) )
			{
				System.out.println("The winner is: " + enemy.getName() );
				
				break;
			}			
		}		
	} // end of public static void main( String args[] )
} // end of public class Driver
