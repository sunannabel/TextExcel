package textExcel;

public class TextCell implements Cell{
	private String fullText;
	private String abbreviatedText;
	
	public TextCell(String text) {
		fullText = text;
		if(fullText.length() < 12) { //10 characters + 2 quotes
			abbreviatedText = text.substring(1, text.length()-1);
			for(int i = fullText.length(); i < 12; i++) {
				abbreviatedText = abbreviatedText + " ";
			}
		} else {
			abbreviatedText = fullText.substring(1, 11);
		}
	}
	
	// text for spreadsheet cell display, must be exactly length 10
	public String abbreviatedCellText() {
		return abbreviatedText;
	}
	
	// text for individual cell inspection, not truncated or padded
	public String fullCellText() {
		return (fullText);
	}
}
