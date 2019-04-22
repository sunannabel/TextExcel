package textExcel;

public class RealCell implements Cell {
	/* contain a field that stores the string representing what the user entered (fullCellText)
	 * make a getDoubleValue() that returns calculated value as a double
	 * getDoubleValue() will be overwritten in subclasses
	 * ValueCell, PercentCell, and FormulaCell extend ReaCell
	 * 
	 * for checkpoint3, getDoubleValue can return aynthing in FormulaCell
	 */
	
	
	public String abbreviatedCellText() {
		// text for spreadsheet cell display, must be exactly length 10
		return null;
	}
	
	public String fullCellText() {
		// text for individual cell inspection, not truncated or padded
		return null;
	}

}
