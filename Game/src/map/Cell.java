package map;

import java.awt.*;
//import javax.swing.*;

public class Cell {

	int size = 20;
	
	Rectangle cellArea;
	
	public Cell(int x, int y){
		x *= size; y*= size;
		
		cellArea = new Rectangle(x, y, size, size);
	}
	
}
