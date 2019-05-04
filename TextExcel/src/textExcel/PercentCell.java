package textExcel;

public class PercentCell extends RealCell {
	
	public PercentCell(String input) {
		super(input);
	}
	
	// text for individual cell inspection, not truncated or padded
	public String fullCellText() {
		int indexOfDecimal = super.fullCellText().indexOf(".");
		String beforeDecimal = super.fullCellText().substring(0, indexOfDecimal);
		String afterDecimal = super.fullCellText().substring(indexOfDecimal + 1, super.fullCellText().length() - 1);
		// fulltext = 0.0 + (stuff before decimal) + (stuff after decimal before %)
		
		if (beforeDecimal.length() == 1) {
			return ("0.0" + beforeDecimal + afterDecimal);
		} else {
			return ("0." + beforeDecimal + afterDecimal);
		}

	}
	
	// text for spreadsheet cell display, must be exactly length 10
	public String abbreviatedCellText() {
		String abbreviatedText = super.fullCellText().substring(0, super.fullCellText().indexOf(".")) + "%";
		return padAbbreviatedText(abbreviatedText);
	}
	
	public double getDoubleValue() {
		double doubleValue = Double.parseDouble(fullCellText());
		return doubleValue;
	}
}
