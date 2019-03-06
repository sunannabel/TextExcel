// @author Annabel Sun

package textExcel;

public class SpreadsheetLocation implements Location {
	
	private int row;
	private int column; 
	
    public SpreadsheetLocation(String cellName) {
        cellname.charAt(0)
    	
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
