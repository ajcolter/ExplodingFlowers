package com.MusicalSketches.datarep;

import java.io.Serializable;
import java.util.ArrayList;

public class NoteSequence implements Serializable{
	
	private ArrayList<Note> notes;
	
	public NoteSequence(ArrayList <Note> notes){
		this.notes = notes;
	}
	
	public NoteSequence() {
		this.notes = new ArrayList<Note>();
	}
	
	public void addNote(int index, Note n){
		notes.add(index, n);
	}
	
	public void removeNote(int index){
		notes.remove(index);
	}
	
	public void setNotes(ArrayList <Note> n){
		this.notes = n;
	}
	
	public ArrayList<Note> getNotes(){
		return this.notes;
	}
	
	public void addNote(Note n) {
		notes.add(n);
	}

}
