package textExcel;

public class ValueCell extends RealCell{
	
	public ValueCell(String input) {
		super(input);
	}

	// text for spreadsheet cell display, must be exactly length 10
	public String abbreviatedCellText() {
		return padAbbreviatedText(getDoubleValue() + "");
	}	
	
	public double getDoubleValue() {
		//returns calculated value of double as a string
		return Double.parseDouble(super.fullCellText());
	}
	

}
