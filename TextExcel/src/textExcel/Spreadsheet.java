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
		sheet = clearSheet(numColumns, numRows, sheet);
	}
	
	
	@Override
	// processes a user command, returns string to display, must be called in loop from main
	public String processCommand(String command) {
		//if short = cell inspection
		if ((command.length() == 2) || (command.length() == 3)) {
			SpreadsheetLocation loc = new SpreadsheetLocation(command);
			return getCell(loc).fullCellText(); //gets cell at loc, returns fullCellText
			
		//if cell assignment
		} else if (command.contains("=")) {
			String[] splitCommand = command.split(" ",3);
			SpreadsheetLocation loc = new SpreadsheetLocation(splitCommand[0]);
			sheet[loc.getCol()][loc.getRow()] = new TextCell(splitCommand[2]);
			return getGridText();

			
		//if any type of clear
		} else if (command.toLowerCase().contains("clear")) {
			
			//if clear entire sheet
			if (command.length() == 5) {
				sheet = clearSheet(numColumns, numRows, sheet);
				return getGridText();
	
			//if clear specific cell
			} else {
				String[] splitCommand = command.split(" ");
				SpreadsheetLocation loc = new SpreadsheetLocation(splitCommand[1]);
				sheet[loc.getCol()][loc.getRow()] = new EmptyCell();
				return getGridText();
			}
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
	public Cell getCell(Location loc) {
		return sheet[loc.getCol()][loc.getRow()];
	}

	@Override
	// returns entire grid, formatted as text for display
	public String getGridText() {
		String fullGrid = "   |";
		
		//header
		char header = 64;
		for(int i = 0; i < numColumns; i++) {
			header += 1;
			fullGrid += header + "         |";		
		}
		fullGrid += "\n";
		
		//the rest of it
		for (int j = 1; j <= numRows; j++) { //go down
			for (int k = 0; k <= numColumns; k++) { //go across
				if (k == 0){
					if (j < 10) {
						fullGrid += j + "  |";
					} else {
						fullGrid += j + " |";
					}
				} else {
					fullGrid += sheet[k-1][j-1].abbreviatedCellText();
					fullGrid += "|";
				}
			}
			fullGrid += "\n";
		}
		
		return fullGrid;
	}
	
	private Cell[][] clearSheet(int numColumns, int numRows, Cell[][] sheet) {
		for (int i = 0; i < numColumns; i++) {
			for (int j = 0; j < numRows; j++) {
				sheet[i][j] = new EmptyCell();
			}
		}
		return sheet;
	}

}
