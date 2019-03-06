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
    			sheet.processCommand(input);
    		}
    	}	
    	userInput.close();
	}
}
