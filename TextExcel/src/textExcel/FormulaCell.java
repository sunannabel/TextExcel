package textExcel;

public class FormulaCell extends RealCell {
	
	public FormulaCell(String input) {
		super(input);
	}
	
	public double getDoubleValue() {
		String[] formulaSplit = fullCellText().split(" ");
		if (formulaSplit[1].equals("SUM")) {
			//filler 
		} else if (formulaSplit[1].equals("AVG")) {
			//filler
		} else {
			for (int i = 1; i < formulaSplit.length - 2; i += 2) {
				double val1 = Double.parseDouble(formulaSplit[i]);
				String op = formulaSplit[i+1];
				double val2 = Double.parseDouble(formulaSplit[i+2]);
				
				formulaSplit[i+2] = eval(val1, op, val2);
			}
		}
		
		return Double.parseDouble(formulaSplit[formulaSplit.length-2]);
	}
	
	public double parse(String str, Spreadsheet sheet) {
		if (str.charAt(0) > 64) { //should check if char is a letter? maybe?
			return (Double.parseDouble(sheet.processCommand(str))); //THIS PROBABLY WON'T WORK FIX IT
		} else {
			return Double.parseDouble(str);
		}
	}
	
	public String eval(double val1, String op, double val2) {
		//there's a lot of stupid converting back and forth from doubles to strings but it works so sorry mrs dreyer
		
		if (op.equals("+")) {
			return (val1 + val2) + "";
			
		} else if (op.equals("-")) {
			return (val1 - val2) + "";
			
		} else if (op.equals("*")) {
			return (val1 * val2) + "";
			
		} else {
			return (val1 / val2) + "";
		}
	}
	
}
