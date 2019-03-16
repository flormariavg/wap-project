package edu.mum.wap.model;

public enum Category {
	
	children( "Children's"),
	teen("Teen and Young Adult"),
	selfHelp("Self-Help"),
	literature("Literature & Fiction"),
	mistery("Mystery & Thriller"),
	sci("Sci-fi & Fantasy"),
	romance("Romance"),
	large("Large Print Books"),
	rare("Rare & Collectible Books");
	
	private String name; 
	private Category(String name) {
		// TODO Auto-generated constructor stub
		this.name= name;
	}
	

}
