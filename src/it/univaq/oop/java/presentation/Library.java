package it.univaq.oop.java.presentation;

import it.univaq.oop.java.TitleManager;
import it.univaq.oop.java.business.impl.MemoryTitleManager;
import it.univaq.oop.java.business.model.Title;
import it.univaq.oop.java.business.model.TitleKind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

public class Library {

		public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
		public static void main(String[] args) throws IOException{
			
			TitleManager manager = new MemoryTitleManager();

			System.out.println("(1) Visualizza titoli");
			
			System.out.println("(2) Inserisci il titolo");
			
			System.out.println("(3) Modifica il titolo");
			
			System.out.println("(4) Elimina il titolo");
			
			System.out.println("(5) Esci");
			
			String line = reader.readLine();
			
			if(line.equals("1")){
				
								
				List<Title> titles = manager.findAllTitles();
				
				viewTitles(titles);
				
			} else if(line.equals("2")){
				
					Title title = createTitle(reader);	
					
					manager.createTitle(title); //inserimento

				} else if(line.equals("3")){
					
					} else if(line.equals("4")){
					
						} else if(line.equals("5")){
						
							}
						
		}
		
	private static void viewTitles(List<Title> titles) {
			// TODO Auto-generated method stub
		
		Iterator<Title> i = titles.iterator();
		while(i.hasNext()){
			Title title = i.next();
		}
		
		/*for(Iterator<Title> i = titles.iterator();i.hasNext();){
			Title title = i.next();
		}*/
		/*
		for(int i = 0; i < titles.length; i ++){	
			System.out.println( "Titolo: " + titles[i].getName()+ "Autore: " + titles[i].getAuthor() );
			}
		 */
		}

	public static Title createTitle(BufferedReader reader) throws IOException{ 
		
		System.out.println("Inserisci il nome");
		String name = reader.readLine();
		System.out.println("Inserisci l'autore");
		String author = reader.readLine();
		System.out.println("Inserisci la descrizione");
		String description = reader.readLine();
		System.out.println("Inserisci l'ISBN");
		String isbn = reader.readLine();
		System.out.println("Inserisci l'anno");
		int year  = Integer.parseInt(reader.readLine());
		System.out.println("Inserisci l'editore");
		String editor = reader.readLine();
		System.out.println("Inserisci il tipo (1:libro, 2:rivista)");
		int kind = Integer.parseInt(reader.readLine());
		
		TitleKind titleKind = new TitleKind(kind, "libro");
		Title title = new Title(name, author, description, isbn, year, editor, titleKind);
		
		return title;
	}
}


