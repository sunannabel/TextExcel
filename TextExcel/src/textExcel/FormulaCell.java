package textExcel;

public class FormulaCell extends RealCell {
	
	private Spreadsheet sheet;
	
	public FormulaCell(String input, Spreadsheet sheet) {
		super(input);
		this.sheet = sheet;
	}


	public double getDoubleValue() {
		String[] formulaSplit = fullCellText().split(" ");
		if (formulaSplit[1].equalsIgnoreCase("SUM") || formulaSplit[1].equalsIgnoreCase("AVG")) {
			double sum = 0; //keeps track of total sum
			String[] splitSum = formulaSplit[2].split("-"); //split into two locations
			SpreadsheetLocation loc1 = new SpreadsheetLocation(splitSum[0]);
			SpreadsheetLocation loc2 = new SpreadsheetLocation(splitSum[1]);
			
			for(int cols = loc1.getCol(); cols <= loc2.getCol(); cols++){ //iterate through columns
				for (int rows = loc1.getRow(); rows <= loc2.getRow(); rows++) { //iterate through rows
					SpreadsheetLocation loc3 = new SpreadsheetLocation(cols, rows); //make a location for current cols / rows
					sum += ((RealCell) sheet.getCell(loc3)).getDoubleValue(); //get double value at current cell, add to sum
				}
			}
			
			if (formulaSplit[1].equalsIgnoreCase("SUM")) {
				return sum;
			} else {
				int colRange = loc2.getCol() - loc1.getCol();
				int rowRange = loc2.getRow() - loc1.getRow();
				return (sum / ((colRange+1) * (rowRange+1)));
			}
			//again: if this works i will cry

		} else {
			for (int i = 1; i < formulaSplit.length - 2; i += 2) {
				double val1 = parse(formulaSplit[i]);
				String op = formulaSplit[i+1];
				double val2 = parse(formulaSplit[i+2]);
				
				formulaSplit[i+2] = eval(val1, op, val2);
			}
			return Double.parseDouble(formulaSplit[formulaSplit.length-2]);
		}
		
	}
	
	public double parse(String str) {
		if (str.charAt(0) > 64) { //should check if char is a letter? maybe?
			SpreadsheetLocation loc = new SpreadsheetLocation(str);
			return (((RealCell) sheet.getCell(loc)).getDoubleValue()); //access the cell, gets the double value, the cast is bc we know it'll be a realcell aaAA
			//if this code works i will cry
		
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
	
	//helper
	private int absValue (int number) {
		if (number < 0) {
			return number * -1;
		} else {
			return number;
		}
	}
	
}
