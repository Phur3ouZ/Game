package items;

public class Item {
	private int itemID;
	
	public Item(int itemID){
		this.itemID = itemID;
	}
	
	public int getItemID(){
		return itemID;
	}
	
	public String toString(){
		String result = "Item ID: " + getItemID();
		return result;
	}
}