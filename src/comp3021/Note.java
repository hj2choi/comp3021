package base;

import java.util.Date;

public class Note {
	private Date date;
	private String title;
	
	public Note(String title) {
		this.title = title;
		date = new Date();
	}
	
	public String getTitle() {
		return title;
	}
	
	public Date getDate() {
		return date;
	}
	
	public boolean equals(Note other) {
		return this.title.equals(other.title);
	}
	
	

}
