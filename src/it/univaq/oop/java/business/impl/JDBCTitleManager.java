package it.univaq.oop.java.business.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import it.univaq.oop.java.TitleManager;
import it.univaq.oop.java.business.BusinessException;
import it.univaq.oop.java.business.model.Title;
import it.univaq.oop.java.business.model.TitleKind;

public class JDBCTitleManager implements TitleManager{

	public JDBCTitleManager() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createTitle(Title title) throws BusinessException {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DriverManager.getConnection( "jdbc:mysql://localhost/javalibrary", "root", "root" );
			
			String sql = "INSERT INTO title(title_id, name, title_kind_id, "
						+ "description, author, isbn, publication_year, editor)"
						+ "VALUES(NULL,?,?,?,?,?,?,?)";
			
			ps = con.prepareStatement(sql);
			ps.setString( 1, title.getName());
			ps.setInt( 2, title.getTitleKind().getId());
			ps.setString( 3, title.getDescription());
			ps.setString( 4, title.getAuthor());
			ps.setString( 5, title.getIsbn());
			ps.setInt( 6, title.getPublicationYear());
			ps.setString( 7, title.getEditor());
			
			ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {     
            if (ps!=null) {
                try {
                   ps.close();
                } catch (SQLException e) {/*Do Nothing*/}
            }
            if (con!=null) {
                try {
                   con.close();
                } catch (SQLException e) {/*Do Nothing*/}
            }
         }
		
		
	}

	@Override
	public List<Title> findAllTitles() throws BusinessException {
		// TODO Auto-generated method stub
		
		List<Title> result = new ArrayList<Title>();
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
				
		try {
			con = DriverManager.getConnection( "jdbc:mysql://localhost/javalibrary", "root", "root" );
			
			st = con.createStatement();
			rs = st.executeQuery("SELECT t.*, "
						+ "tk.name AS title_kind_name  "
					+ "FROM title t INNER JOIN title_kind tk "
					+ "WHERE t.title_kind_id = tk.title_kind_id "
					+ "ORDER BY t.name");
			
			while (rs.next()){
				int title_id = rs.getInt("title_id");
				String name = rs.getString("name");
				String author = rs.getString("author");
				String description = rs.getString("description");
				String isbn = rs.getString("isbn");
				int publication_year = rs.getInt("publication_year");
				String editor = rs.getString("editor"); 
				int title_kind_id = rs.getInt("title_kind_id");;
				String title_kind_name = rs.getString("title_kind_name");
				
				TitleKind titleKind = new TitleKind(title_kind_id, title_kind_name);
				Title title = new Title(title_id, name, author, description, isbn, publication_year, editor, titleKind);
				
				result.add(title);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
		finally {
            if (rs!=null) {
                try {
                   rs.close();
                } catch (SQLException e) {/*Do Nothing*/}
            }
            if (st!=null) {
                try {
                   st.close();
                } catch (SQLException e) {/*Do Nothing*/}
            }
            if (con!=null) {
                try {
                   con.close();
                } catch (SQLException e) {/*Do Nothing*/}
            }
         }
		
		return result;
	}

}
