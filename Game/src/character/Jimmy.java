package character;

public class Jimmy extends Character{

	public Jimmy(){
		super(10);
	}
	
	public static void main(String[] args) {
		Jimmy Jimmy = new Jimmy();
		System.out.println(Jimmy.getHealth());
		Jimmy.hurt();
		System.out.println(Jimmy.getHealth());
	}
}
