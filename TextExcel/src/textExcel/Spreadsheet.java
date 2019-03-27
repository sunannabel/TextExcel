// @author Annabel Sun

package textExcel;

public class Spreadsheet implements Grid {

	private Cell[][] sheet;
	private int numColumns;
	private int numRows;
	
	public Spreadsheet() {
		numColumns = 12;
		numRows = 20;
		sheet = new Cell[numColumns][numRows];
		for (int i = 0; i < numColumns; i++) {
			for (int j = 0; j < numRows; j++) {
				sheet[i][j] = new EmptyCell();
			}
		}
	}
	
	
	@Override
	// processes a user command, returns string to display, must be called in loop from main
	public String processCommand(String command) {
		if (command.length() <= 3) {
			//filler
		} else if (command.contains("=")) {
			String[] splitCommand = command.split(" ");
		} else if (command.equals("clear")) {
			//filler
		} else if (command.contains("clear")) {
			//filler
		}
		return "";
	}

	@Override
	// returns number of rows in grid
	public int getRows() {
		return numRows; //number of rows
	}

	@Override
	// returns number of columns in grid
	public int getCols() {
		return numColumns; //number of columns
	}

	@Override
	// returns cell at loc
	public Cell getCell(Location loc)
	{
		return sheet[loc.getRow()][loc.getCol()];
	}

	@Override
	// returns entire grid, formatted as text for display
	public String getGridText()
	{
		
		return null;
	}

}
