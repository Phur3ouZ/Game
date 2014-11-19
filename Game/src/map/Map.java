package map;

public class Map {
	
	int mapSize_x = 800;
	int mapSize_y = 800;
	
	Cell[][] cells;

	public void createMap(){
		cells = new Cell[mapSize_x][mapSize_y];
		
		for (int x = 0; x < cells.length; x++){
			for (int y = 0; y < cells[x].length; y++){
				cells[x][y] = new Cell(x, y);
			}
		}
		
	}
	
}