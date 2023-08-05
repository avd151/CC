/**
 * 
 */
package com.db.grad.javaapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumns;
import javax.persistence.Table;

/**
 * id, bookname
 */
@Entity
@Table(name="book")
public class Book {
	@Id
//	TODO: @PrimaryKeyJoinColumns(value = { @PrimaryKeyJoinColumn })
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String bookName;
	public long getId() {
		return id;
	}
//	public void setId(long id) {
//		this.id = id;
//	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Book(String bookName) {
		super();
		this.bookName = bookName;
	}
	public Book(long id, String bookName) {
		super();
		this.id = id;
		this.bookName = bookName;
	}
}
