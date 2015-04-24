package it.univaq.oop.java.presentation;

import it.univaq.oop.java.TitleManager;
import it.univaq.oop.java.business.model.Title;
import it.univaq.oop.java.business.model.TitleKind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Library {

		public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
		public static void main(String[] args) throws IOException{
								
			System.out.println("(1) Visualizza titoli");
			
			System.out.println("(2) Inserisci il titolo");
			
			System.out.println("(3) Modifica il titolo");
			
			System.out.println("(4) Elimina il titolo");
			
			System.out.println("(5) Esci");
			
			String line = reader.readLine();
			
			if(line.equals("1")){
				
				Title[] titles = TitleManager.findAllTitles();
				
				viewTitles(titles);
				
			} else if(line.equals("2")){
				
					Title title = createTitle(reader);	
					
					TitleManager.create(title); //inserimento

				} else if(line.equals("3")){
					
					} else if(line.equals("4")){
					
						} else if(line.equals("5")){
						
							}
						
		}
		
	private static void viewTitles(Title[] titles) {
			// TODO Auto-generated method stub
			for(int i = 0; i < titles.length; i ++){
				
				System.out.println( "Titolo: " + titles[i].getName()+ "Autore: " + titles[i].getAuthor() );
			}
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


