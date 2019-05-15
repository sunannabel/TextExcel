package textExcel;

public class RealCell implements Cell {
	/* contain a field that stores the string representing what the user entered (fullCellText)
	 * make a getDoubleValue() that returns calculated value as a double
	 * ValueCell, PercentCell, and FormulaCell extend RealCell
	 */
	
	private String inputText;
	
	public RealCell(String input) {
		inputText = input;
	}
	
	// text for spreadsheet cell display, must be exactly length 10
	public String abbreviatedCellText() {
		return padAbbreviatedText(getDoubleValue() + "");
	}
	
	// text for individual cell inspection, not truncated or padded
	public String fullCellText() {
		return inputText;
	}

	public double getDoubleValue() {
		return 0.0;
	}

	//helper 
	public String padAbbreviatedText(String text) {
		if (text.length() < 10) {
			for(int i = text.length(); i < 10; i++) {
				text += " ";
			}
		} else {
			text = text.substring(0, 10);
		}
		return text;
	}
}
