package textExcel;

public class ValueCell extends RealCell{
	
	public ValueCell(String input) {
		super(input);
	}
	
	public double getDoubleValue() {
		//returns calculated value of double as a string
		return Double.parseDouble(super.fullCellText());
	}
	
}
