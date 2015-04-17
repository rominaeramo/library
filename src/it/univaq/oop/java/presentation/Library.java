package it.univaq.oop.java.presentation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Library {
		
		public static void main(String[] args) throws IOException{
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("(1) Visualizza titoli");
			
			System.out.println("(2) Inserisci il titolo");
			
			System.out.println("(3) Modifica il titolo");
			
			System.out.println("(4) Elimina il titolo");
			
			System.out.println("(5) Esci il titolo");
			
			String line = reader.readLine();
			
			if(line.equals("1")){
				
			} else if(line.equals("2")){
				
				System.out.println("Inserisci il nome");
				String nome = reader.readLine();
				System.out.println("Inserisci l'autore");
				String autore = reader.readLine();
				//....
				//nome, autore, descrizione, ISBN, anno, editore

				} else if(line.equals("3")){
					
					} else if(line.equals("4")){
					
						} else if(line.equals("5")){
						
							}
			
			
		}
		
	}


