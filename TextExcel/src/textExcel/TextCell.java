package textExcel;

public class TextCell implements Cell{
	private String fullText;
	private String abbreviatedText;
	
	public TextCell(String text) {
		fullText = text.substring(1, text.length()-1);
		if(fullText.length() < 10) {
			abbreviatedText = fullText;
			for(int i = fullText.length(); i < 10; i++) {
				abbreviatedText = abbreviatedText + " ";
			}
		} else {
			abbreviatedText = fullText.substring(0, 10);
		}
	}
	
	// text for spreadsheet cell display, must be exactly length 10
	public String abbreviatedCellText() {
		return abbreviatedText;
	}
	
	// text for individual cell inspection, not truncated or padded
	public String fullCellText() {
		return ("\"" + fullText + "\"");
	}
}
