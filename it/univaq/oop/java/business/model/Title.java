/**
 * 
 */
package it.univaq.oop.java.business.model;

/**
 * @author romina
 *
 */
public class Title {
	
	private int id;
	private String name;
	private String author;
	private String description;
	private String isbn;
	private int publicationYear;
	private String editor;
	private TitleKind titleKind;

	/**
	 * 
	 */
	public Title() {
		// TODO Auto-generated constructor stub
	}
	
	public Title(String name, String author, String description, String isbn,
			int publicationYear, String editor, TitleKind titleKind) {
		super();
		this.name = name;
		this.author = author;
		this.description = description;
		this.isbn = isbn;
		this.publicationYear = publicationYear;
		this.editor = editor;
		this.titleKind = titleKind;
	}

	
	public Title(int id, String name, String author, String description,
			String isbn, int publicationYear, String editor, TitleKind titleKind) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.description = description;
		this.isbn = isbn;
		this.publicationYear = publicationYear;
		this.editor = editor;
		this.titleKind = titleKind;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public TitleKind getTitleKind() {
		return titleKind;
	}

	public void setTitleKind(TitleKind titleKind) {
		this.titleKind = titleKind;
	}
	
	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
