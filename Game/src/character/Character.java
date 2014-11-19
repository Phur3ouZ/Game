package character;

public class Character {
	private int health;
	
	public Character(int health){
		this.health = health;
	}
	
	public int getHealth() {
		return health;
	}
	
	private void setHealth(int health) {
		this.health = health;
	}
	
	public void hurt(){
		setHealth(getHealth() - 1);
	}
}
