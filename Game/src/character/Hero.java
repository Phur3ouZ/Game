package character;

import items.Equipment;
import items.Item;
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
	private static ArrayList<Item> inventory;
	private static ArrayList<Equipment> equipment;
	
	public Hero(int health, int mana, int damage){
		super(health, mana, damage);
		inventory = new ArrayList();
		equipment = new ArrayList();
	}
	
	public ArrayList<Item> getInventory(){
		return this.inventory;
	}
	
	public ArrayList<Equipment> getEquipment(){
		return this.equipment;
	}
		
	public static void useItem(UseableItem item){
		if(inventory.contains(item)){
			inventory.remove(item);
			
		}else{
			System.out.println("Mate, you ain't got sheet son");
		}
	}
	
	public static void main(String[] args) {
		Hero Jimmy = new Hero(3, 3, 3);
		UseableItem item = new UseableItem(4);
		Jimmy.getInventory().add(0,item);
		useItem(item);
	}
}

