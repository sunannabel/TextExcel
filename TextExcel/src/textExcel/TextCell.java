package textExcel;

public class TextCell implements Cell{
	private String fullText;
	private String abbreviatedText;
	
	public TextCell(String text) {
		fullText = text;
		if(text.length() < 10) {
			abbreviatedText = text;
		} else {
			abbreviatedText = text.substring(0, 10);
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
