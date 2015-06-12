/**
 * 
 */
package it.univaq.oop.java.business.impl;

import java.util.ArrayList;
import java.util.List;

import it.univaq.oop.java.TitleManager;
import it.univaq.oop.java.business.BusinessException;
import it.univaq.oop.java.business.model.Title;
import it.univaq.oop.java.business.model.TitleKind;

/**
 * @author romina
 *
 */
public class MemoryTitleManager implements TitleManager{

	private static final TitleKind BOOK = new TitleKind(1, "book");
	private static final TitleKind MAGAZINE = new TitleKind(2, "magazine");
	
	/*private static Title[] titles = { new Title("Thinking in Java", "Pippo", "description", "872918765",
			2006, "Paerson", BOOK)};
	*/
	protected static List<Title> titles = new ArrayList<Title>();		
	static {
		titles.add( new Title(1,"Thinking in Java - volume 1", "Bruce Eckel", "Manuale di Java. I fondamenti", "8871923030", 2006, "Pearson", BOOK));
		titles.add( new Title(2,"Thinking in Java - volume 2", "Bruce Eckel", "Manuale di Java. Tecniche Avanzate", "8871923049", 2006, "Pearson", BOOK));
		titles.add( new Title(3, "Thinking in Java - volume 3", "Bruce Eckel", "Manuale di Java. Concorrenza ed interfacce grafiche", "8871923057", 2006, "Pearson", BOOK));
	};	
	
	
	/*static Set<Title> s = new HashSet<Title>();
	static {
		s.add( new Title("Thinking in Java - volume 1", "Bruce Eckel", "Manuale di Java. I fondamenti", "8871923030", 2006, "Pearson", LIBRO));
		s.add( new Title("Thinking in Java - volume 1", "Bruce Eckel", "Manuale di Java. I fondamenti", "8871923030", 2006, "Pearson", LIBRO));
		
		};	
	*/
	public MemoryTitleManager() {
		// TODO Auto-generated constructor stub
	}	
	
	
	//create a title
	public void createTitle(Title title) throws BusinessException{
		
	}

	public List<Title> findAllTitles() throws BusinessException{
		// TODO Auto-generated method stub	
		return titles;
	}
	

}
