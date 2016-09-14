package base;

import java.util.ArrayList;

public class Folder {
	private ArrayList<Note> notes;
	private String name;
	
	public Folder(String name) {
		this.name = name;
		notes = new ArrayList<Note>();
	}
	
	public void addNote(Note note) {
		notes.add(note);
	}
	
	public String getName() {
		return this.name;
	}
	
	public ArrayList<Note> getNotes() {
		return notes;
	}
	
	public boolean equals(Folder other) {
		return this.name.equals(other.getName());
	}
	
	public String toString() {
		int nText = 0;
		int nImage = 0;
		
		//TODO
		
		return this.name + ":" + nText + ":" + nImage;
	}

}
