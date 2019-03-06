// @author Annabel Sun

package textExcel;

public class Spreadsheet implements Grid
{

	public Spreadsheet() {
		
	}
	
	
	@Override
	// processes a user command, returns string to display, must be called in loop from main
	public String processCommand(String command) {
		return "";
	}

	@Override
	// returns number of rows in grid
	public int getRows() {
		return 20; //number of rows
	}

	@Override
	// returns number of columns in grid
	public int getCols() {
		return 12; //number of columns
	}

	@Override
	// returns cell at loc
	public Cell getCell(Location loc)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	// returns entire grid, formatted as text for display
	public String getGridText()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
