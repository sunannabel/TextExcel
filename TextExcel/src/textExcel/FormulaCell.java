package textExcel;

public class FormulaCell extends RealCell {
	
	public FormulaCell(String input) {
		super(input);
	}
	
	// text for spreadsheet cell display, must be exactly length 10
	public String abbreviatedCellText() {
		return "formula   ";
	}
	
}
