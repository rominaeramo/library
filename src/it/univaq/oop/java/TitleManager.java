package it.univaq.oop.java;

import java.util.List;
import it.univaq.oop.java.business.model.Title;
import it.univaq.oop.java.business.BusinessException;

public interface TitleManager {
	
	void createTitle(Title title) throws BusinessException;

	List<Title> findAllTitles() throws BusinessException;
}
