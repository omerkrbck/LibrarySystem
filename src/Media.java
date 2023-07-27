import java.io.Serializable;

// SUPER CLASS    // Base Class
public class Media implements Serializable{    // Serializable for textfile

	private static int ID_counter=0;
	
	private int ID;
	
	private String title;     // The Media Class has a title and a genre parameter.
	
	private String genre;
	
	private String member;
	

	// Generate Constructor --- ALT+SHIFT+S --- Generate Constructor using Fields.
	
	public Media() {
	}

	public Media(String title, String genre) {
	
		this.title = title;
		this.genre = genre;
		ID_counter++;
		this.ID=ID_counter;
	}
	
    public Media(String member) {
		
		this.member = member;
	}
	
	// Generate Getters and Setters for ID, title, and genre --- ALT+SHIFT+S --- Generate Getters and Setters
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getMember() {
		return member;
	}

	public void setMember(String member) {
		this.member = member;
	}
	
	// Generate a method named bring_information(media_information).
	public String bring_information(String media_information) {
		return media_information;
	}
}
