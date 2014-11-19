package character;

public class Character {
	private int health; //Health pool - maybe x * vit
	private int mana; //Mana pool - maybe a constant, with more magic meaning less mana used per spell
	private int damage; //Damage dealt - maybe x * str
	
	public Character(int health, int mana, int damage){
		this.health = health;
		this.mana = mana;
		this.damage = damage;
	}
	
	//Health
	public int getHealth() {
		return health;
	}
	
	protected void setHealth(int health) {
		this.health = health;
	}
	
	//Mana
	public int getMana() {
		return mana;
	}
	
	protected void setMana(int mana) {
		this.mana = mana;
	}
	
	//Damage
	public int getDamage() {
		return damage;
	}
	
	protected void setDamage(int damage) {
		this.damage = damage;
	}
	
	public void attack(){
		
	}
	
	public void move(){
		
	}
}
