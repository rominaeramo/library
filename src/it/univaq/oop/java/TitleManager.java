package it.univaq.oop.java;

import it.univaq.oop.java.business.model.Title;

public interface TitleManager {
	
	void create(Title title);

	Title[] findAllTitles();
}
