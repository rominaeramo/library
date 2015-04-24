package it.univaq.oop.java;

import it.univaq.oop.java.business.model.Title;
import it.univaq.oop.java.business.model.TitleKind;

public class TitleManager {
	
	private static final TitleKind BOOK = new TitleKind(1, "book");
	private static final TitleKind MAGAZINE = new TitleKind(2, "magazine");
	
	private static Title[] titles = { new Title("Thinking in Java", "Pippo", "description", "872918765",
			2006, "Paerson", BOOK)};
	
	public TitleManager() {
		// TODO Auto-generated constructor stub
	}
	
	//create a title
	public static void create(Title title){
		
	}

	public static Title[] findAllTitles() {
		// TODO Auto-generated method stub
		
		return titles;
	}
}
