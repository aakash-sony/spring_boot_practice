package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Book;

@Repository
public class BookOpDaoImpl implements IBookOpDao {

	private final String INSERTION_QUERY = "INSERT INTO BOOK(B_NAME, B_AUTHOR, B_PRICE, B_QTY) VALUES (?,?,?,?)";
	private final String RETRIVAL_QUERY = "SELECT * FROM BOOK ORDER BY B_CODE";
	private final String DELETION_QUERY = "DELETE FROM BOOK WHERE B_CODE = ?";
	private final String UPDATION_QUERY = "UPDATE BOOK SET B_NAME = ?, B_AUTHOR = ?, B_PRICE = ?, B_QTY = ? WHERE B_CODE = ?";
	private final String RETRIEVE_QUERY = "SELECT * FROM BOOK WHERE B_CODE = ?";

	@Autowired
	private DataSource ds;

	@Override
	public int insertBook(Book book) {
		int rowInserted = 0;
		try {
			Connection connection = ds.getConnection();
			PreparedStatement ps = connection.prepareStatement(INSERTION_QUERY);
			ps.setString(1, book.getBookTitle());
			ps.setString(2, book.getBookAuthor());
			ps.setDouble(3, book.getBookPrice());
			ps.setInt(4, book.getBookQty());

			rowInserted = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowInserted;
	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> bookLists = new ArrayList<Book>();
		try {
			Connection connection = ds.getConnection();
			PreparedStatement ps = connection.prepareStatement(RETRIVAL_QUERY);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Book book = new Book();
				book.setBookId(rs.getInt(1));
				book.setBookTitle(rs.getString(2));
				book.setBookAuthor(rs.getString(3));
				book.setBookPrice(rs.getDouble(4));
				book.setBookQty(rs.getInt(5));

				bookLists.add(book);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bookLists;
	}

	@Override
	public int deleteBook(int id) {
		int rowDeleted = 0;
		try {
			Connection connection = ds.getConnection();
			PreparedStatement ps = connection.prepareStatement(DELETION_QUERY);
			ps.setInt(1, id);

			rowDeleted = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowDeleted;
	}

	@Override
	public int updateBook(Book book) {
		int rowUpdated = 0;
		try {
			Connection connection = ds.getConnection();
			PreparedStatement ps = connection.prepareStatement(UPDATION_QUERY);
			ps.setString(1, book.getBookTitle());
			ps.setString(2, book.getBookAuthor());
			ps.setDouble(3, book.getBookPrice());
			ps.setInt(4, book.getBookQty());
			ps.setInt(5, book.getBookId());

			rowUpdated = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowUpdated;
	}

	@Override
	public Book getBookByid(int id) {
		Book book = null;
		try {
			Connection connection = ds.getConnection();
			PreparedStatement ps = connection.prepareStatement(RETRIEVE_QUERY);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				book = new Book();
				book.setBookId(rs.getInt(1));
				book.setBookTitle(rs.getString(2));
				book.setBookAuthor(rs.getString(3));
				book.setBookPrice(rs.getDouble(4));
				book.setBookQty(rs.getInt(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return book;
	}

}
