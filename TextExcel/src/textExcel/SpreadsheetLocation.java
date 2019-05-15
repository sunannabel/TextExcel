// @author Annabel Sun

package textExcel;

public class SpreadsheetLocation implements Location { 
	
	private int row;
	private int column; 
	
    public SpreadsheetLocation(String cellName) {
        cellName = cellName.toUpperCase();
    	column = (cellName.charAt(0) - 65);
    	row = Integer.parseInt(cellName.substring(1))-1;
    }
	
	public SpreadsheetLocation(int column, int row) {
		this.column = column;
		this.row = row;
	}
    
	@Override
    // gets row of this location
    public int getRow() {
        return row;
    }

    @Override
    // gets column of this location
    public int getCol() {
        return column;
    }
    

}
