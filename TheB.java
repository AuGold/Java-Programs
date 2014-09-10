//How to attack: Take Random generate number from 0 - Str
//				 Take Random generate number from 1 - Dex/2
//				 Attack 'Dex/2' times doing 'Str' damage
//				 random generate from 0 - Dex
//				 if above 3dex/4 then crit!

//Attack for spells: random generate from 0 - Int
//					 if above 3int/4 then crit!

//Defend: generate from 1 - Str

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class TheB
{
	static ArrayList<String> spells = new ArrayList<String>();
	static ArrayList<Integer> sDmg = new ArrayList<Integer>();
	static ArrayList<Integer> sMana = new ArrayList<Integer>();
	static ArrayList<String> inventory = new ArrayList<String>();
	static ArrayList<String> body = new ArrayList<String>();
	
	static int Health, Mana, Str, Int, Dex, Money, EXP = 0, EXPn = 100, level = 1;
	static String name, weapon, clax;
	
	static int mHealth, mAttack, mEXP, mTemp, moneyM;
	static boolean victory = false, spellUsed = false, itemUsed = false, noMana = false;
	
	static String uInput;
	static int tempA, tempB, tempC, tempD;
	
	static Scanner blargh = new Scanner(System.in);
	static Random generator = new Random();
	
	public static void main(String[] args)
	{
		System.out.println("You are falling deep into darkness...");
		blargh.nextLine();
		System.out.println("You fall until you land on a dark surface, surrounded by 3 objects");
		System.out.println("As you look around you, you notice the objects are a sword, staff and bow");
		blargh.nextLine();
		System.out.println("In front of you spawns a small creature, which is slowly moving towards you");
		for(;;)
		{
			System.out.print("In a fast reaction you decide to grab the....  ");
			weapon = blargh.nextLine();
			if(weapon.equalsIgnoreCase("sword"))
			{
				System.out.println("You picked up the sword!");
				Health = 20;
				Mana = 5;
				Str = 10;
				Int = 2;
				Dex = 4;
				spells.add("Slash");
				sDmg.add(7);
				sMana.add(2);
				body.add("Sword");
				clax = "Fighter";
				System.out.println("");
				stats();
				break;
			}
			else if(weapon.equalsIgnoreCase("staff"))
			{
				System.out.println("You picked up the staff!");
				Health = 10;
				Mana = 25;
				Str = 3;
				Int = 15;
				Dex = 5;
				spells.add("Fire");
				sDmg.add(10);
				sMana.add(5);
				body.add("Staff");
				clax = "Mage";
				System.out.println("");
				stats();
				break;
			}
			else if(weapon.equalsIgnoreCase("bow"))
			{
				System.out.println("You picked up the bow!");
				Health = 15;
				Mana = 7;
				Str = 4;
				Int = 4;
				Dex = 10;
				spells.add("Powershot");
				sDmg.add(6);
				sMana.add(3);
				body.add("Bow");
				clax = "Archer";
				System.out.println("");
				stats();
				break;
			}
			else
			{
				System.out.println("You can't pick that up");
			}
		}
		blargh.nextLine();
		System.out.println("The object jumps at you and attacks!");
		blargh.nextLine();
		Fight("mysterious creature");
		System.out.println("A potion has been added to your inventory");
		inventory.add("Potion");
		blargh.nextLine();
		System.out.println("You take a heavy breath after defeating the mysterious creature");
		blargh.nextLine();
		System.out.println("After catching your breath a light shines in front of you and a door appears");
		System.out.println("You hear a loud booming voice from above");
		System.out.println("\"ENTER\"");
		System.out.println("You approach the door and slowly push it open");
		System.out.println("A bright light fills the room as you enter and close the door behind you");
		blargh.nextLine();
		System.out.println("The light fades away and you hear the slam of the door");
		System.out.println("\"YOU. WHAT IS YOUR NAME\" you hear the large voice ask   ");
		System.out.print("So, what is your name?    ");
		name = blargh.nextLine();
		while(name.equals(""))
		{
			System.out.println("You did not input a name....");
			System.out.print("Put in your name: ");
			name = blargh.nextLine();
		}
		System.out.println("\"My name is " + name + "\" you respond with");
		System.out.println("\"" + name.toUpperCase() + "? INTERESTING\"");
		blargh.nextLine();
		System.out.println("\"WELL " + name.toUpperCase() + " SHOW ME YOUR SKILLS\"");
		System.out.println("Around you, 3 mysterious creatures spawn and charge at you");
		blargh.nextLine();
		Fight("3 mysterious creatures");
		System.out.println("\"EXCELLENT. YOU ARE WORTHY\"");
	}
	
	public static void Fight(String monster)
	{
		int healthTemp = Health, manaTemp = Mana;
		
		if(monster.equals("mysterious creature"))
		{
			mHealth = 15;
			mAttack = 2;
			mEXP = 100;
			moneyM = 50;
		}
		else if(monster.equals("3 mysterious creatures"))
		{
			mHealth = 45;
			mAttack = 6;
			mEXP = 300;
			moneyM = 0;
		}
		else
		{
			mHealth = 0;
			mAttack = 0;
			mEXP = 0;
		}
		System.out.println("The " + monster + " waits for you to attack!");
		for(;mHealth > 0 && healthTemp > 0;)
		{
			spellUsed = false;
			itemUsed = false;
			System.out.println("Your health: " + healthTemp + "     Enemy health: " + mHealth);
			System.out.println("You mana:    " + manaTemp);
			System.out.println("What would you like to do?");
			System.out.print("[Attack, Magic, Defend, Inventory]   ");
			uInput = blargh.nextLine();
			System.out.println("");
			if(uInput.equalsIgnoreCase("attack"))
			{
				tempA = generator.nextInt(Str);
				tempD = tempA;
				tempB = (generator.nextInt(Dex) + 2) / 2;
				for(;tempB > 0 ; tempB--)
				{
					if(tempA == 0)
					{
						System.out.println("You missed!");
						break;
					}
					tempC = generator.nextInt(Dex);
					if(tempC >= (3.0 / 4.0) * Dex)
					{
						tempA *= 1.5;
						System.out.println("You perfofmed a critical hit!");
					}
					System.out.println("You attack the monster and deal " + tempA + " damage");
					mHealth -= tempA;
					tempA = tempD;
					if(mHealth <= 0)
					{
						break;
					}
				}
				if(mHealth > 0)
				{
					mTemp = generator.nextInt(mAttack);
					System.out.println("You were hit for " + mTemp + " damage");
					healthTemp-= mTemp;
					blargh.nextLine();
				}
			}
			else if(uInput.equalsIgnoreCase("magic"))
			{
				for(;;)
				{
					System.out.println("");
					System.out.println("What spell would you like to use?  ");
					System.out.print(spells + "   ");
					uInput = blargh.nextLine();
					if(uInput.equalsIgnoreCase("back"))
						break;
					for(int i = 0 ; i < spells.size() ; i++)
					{
						if(uInput.equalsIgnoreCase(spells.get(i)))
						{
							if(sMana.get(i) > manaTemp)
							{
								System.out.println("You cannot use this spell! You don't have enough mana");
								noMana = true;
								break;
							}
							else
							{
								tempA = generator.nextInt(Int);
								tempB = sDmg.get(i);
								if(tempA >= (3.0 / 4.0) * Int)
								{
									tempB *= 1.5;
									System.out.println("You performed a critical hit!");
								}
								manaTemp -= sMana.get(i);
								System.out.println("You use " + spells.get(i) + " and deal " + tempB);
								mHealth -= tempB;
								spellUsed = true;
							}
						}
					}
					if(spellUsed == false && noMana == false)
					{
						System.out.println("You do not know that spell!");
					}
					if(spellUsed == true && mHealth > 0)
					{
						mTemp = generator.nextInt(mAttack);
						System.out.println("You were hit for " + mTemp + " damage");
						healthTemp-= mTemp;
						blargh.nextLine();
						break;
					}
					else if(mHealth <= 0)
						break;
				}
			}
			else if(uInput.equalsIgnoreCase("defend"))
			{
				tempA = generator.nextInt(Str - 1) + 1;
				System.out.println("You block and prepare for an incoming attack");
				mTemp = generator.nextInt(mAttack);
				System.out.println("The " + monster + " attacks for " + mTemp + " and you block " + tempA);
				if(mTemp - tempA <= 0)
					System.out.println("You take 0 damage");
				else
				{
					System.out.println("You were hit for " + (mTemp - tempA) + " damage");
					healthTemp-= mTemp - tempA;
				}
				blargh.nextLine();
			}
			else if(uInput.equalsIgnoreCase("inventory"))
			{
				if(inventory.size() == 0)
					System.out.println("You have no items in your inventory");
				else
				{
					for(;;)
					{
						System.out.println("What would you like to use?");
						System.out.print(inventory + "  ");
						uInput = blargh.nextLine();
						if(uInput.equalsIgnoreCase("back"))
							break;
						else
						{
							for(int i = 0 ; i < inventory.size() ; i++)
							{
								if(uInput.equalsIgnoreCase(inventory.get(i)))
								{
									if(inventory.get(i).equals("Potion"));
									{
										System.out.println("You used a potion and healed 10 Health!");
										if((healthTemp += 10) > Health)
											healthTemp = Health;
										else
											healthTemp += 10;
										itemUsed = true;
										inventory.remove(i);
										break;
									}
								}
							}
						}
						if(itemUsed == false)
							System.out.println("You do not have that item!");
						if(itemUsed == true && mHealth > 0)
						{
							mTemp = generator.nextInt(mAttack);
							System.out.println("You were hit for " + mTemp + " damage");
							healthTemp-= mTemp;
							blargh.nextLine();
							break;
						}
					}
				}
			}
			else
			{
				System.out.println("I do not understand that command");
			}
			if(mHealth <= 0)
			{
				victory = true;
				break;
			}
			if(healthTemp <= 0)
			{
				victory = false;
			}
		}
		if(victory == true)
		{
			System.out.println("Victory!");
			System.out.println("You gained " + mEXP + " EXP and " + moneyM + " money!");
			EXP += mEXP;
			Money += moneyM;
			levelup();
		}
		else
		{
			System.out.println("You died from a " + monster);
			blargh.nextLine();
			System.out.println("You have lost");
			System.exit(0);
		}
	}
	
	public static void levelup()
	{
		while(EXP >= EXPn)
		{
			EXP = EXP - EXPn;
			EXPn *= (3/2);
			level++;
			System.out.println("You have leveled up to level " + level);
			blargh.nextLine();
			if(clax.equals("Fighter"))
			{
				Health += 2;
				Mana += 1;
				Str += 3;
				Int += 1;
				Dex += 2;
				stats();
			}
			else if(clax.equals("Mage"))
			{
				Health += 1;
				Mana += 2;
				Str += 2;
				Int += 3;
				Dex += 1;
				stats();
			}
			else
			{
				Health += 1;
				Mana += 1;
				Str += 2;
				Int += 1;
				Dex += 3;
				stats();
			}
			blargh.nextLine();
		}
	}
	
	public static void stats()
	{
		System.out.println("Health: " + Health + "   /   Mana: " + Mana + "   /   Str: " + Str);
		System.out.println("Int: " + Int + "   /   Dex: " + Dex + "   /   Money: " + Money);
	}
}






















