// @author Annabel Sun

package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextExcel {

	public static void main(String[] args) {
		
		boolean done = false;
    	Scanner userInput = new Scanner(System.in);
    	Spreadsheet sheet = new Spreadsheet();
    	    	
    	while (!done) {
    		System.out.print("Enter a command: ");
    		String input = userInput.nextLine();
    		if (input.equals("quit")) {
    			done = true;
    		} else {
    			System.out.println(sheet.processCommand(input));
    		} 
    	}	
    	userInput.close();
	}
}

//|A         |B         |C         |D         |E         |F         |G         |H         |I         |J         |K         |L         |
//1  |0.0       |0.0       |0.0       |0.0       |0.0       |          |          |          |          |          |          |          |
//2  |0.0       |1.0       |2.0       |3.0       |4.0       |          |          |          |          |          |          |          |
//3  |0.0       |2.0       |4.0       |6.0       |8.0       |          |          |          |          |          |          |          |
//4  |0.0       |3.0       |6.0       |9.0       |12.0      |