/**
 * 
 */
package it.univaq.oop.java.business.model;

/**
 * @author romina
 *
 */
public class TitleKind {
	
	private int id;
	private String name; // 1:book 2:magazine
	/**
	 * 
	 */
	public TitleKind() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param name
	 */
	public TitleKind(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
