package character;

import items.UseableItem;

import java.util.ArrayList;

public class Hero extends Character{
	
	//Hero Stats Related
	private int level;
	private int statPoints; //How many stats able to be used per level
	
	private int strength; //Physical Strength
	private int vitality; //Health related
	private int endurance; //Tank related
	private int dexterity; //Speed
	private int reflexes; //Evasion
	private int intelligence; //Magical Strength
	private int wisdom; //Smart
	private int magic; //Magic Pool
	private int luck; //
	private int hunger; 
	private int stamina;
	private int status; //Poisoned,Slept etc
	
	//Hero Inventory Related
	private ArrayList inventory;
	private ArrayList equipment;
	
	public Hero(){
		super(3, 3, 3);
	}
		
	public void useItem(UseableItem item){
		
	}
	
}
