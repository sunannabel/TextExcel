// @author Annabel Sun

package textExcel;

public class Spreadsheet implements Grid {

	private Cell[][] sheet;
	private int numColumns;
	private int numRows;
	
	public Spreadsheet() {
		numRows = 20;
		numColumns = 12;
		sheet = new EmptyCell[numColumns][numRows];
	}
	
	
	@Override
	// processes a user command, returns string to display, must be called in loop from main
	public String processCommand(String command) {
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
