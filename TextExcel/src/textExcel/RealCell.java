package textExcel;

public class RealCell implements Cell {
	/* contain a field that stores the string representing what the user entered (fullCellText)
	 * make a getDoubleValue() that returns calculated value as a double
	 * ValueCell, PercentCell, and FormulaCell extend ReaCell
	 */
	
	private String fullText;
	private String abbreviatedText;
	
	public RealCell(String input) {
		fullText = input;
		abbreviatedText = input.substring(0, 10);
	}
	
	
	public String abbreviatedCellText() {
		// text for spreadsheet cell display, must be exactly length 10
		// OVERRIDE IN SUBCLASSES
		return abbreviatedText;
	}
	
	public String fullCellText() {
		// text for individual cell inspection, not truncated or padded
		return fullText;
	}

	public double getDoubleValue() {
		// OVERRIDE IN SUBCLASSES
		return 0.0;
	}
	
}
