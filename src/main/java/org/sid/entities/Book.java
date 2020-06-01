package org.sid.entities;

import java.io.Serializable;


import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Book implements Serializable {
	
		@Id @GeneratedValue
		private long id;
		private String title;
		private String author;
		private String description;
		private String category;
		private double note;
		private double price;
		private int stock;
		private String image;
		public String getImage() {
			return image;
		}
		public void setImage(String image) {
			this.image = image;
		}
		// GETTERS AND SETTERS
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
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
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public double getNote() {
			return note;
		}
		public void setNote(double note) {
			this.note = note;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getStock() {
			return stock;
		}
		public void setStock(int stock) {
			this.stock = stock;
		}
		
		// Constructor with parameters
		public Book(String title, String author, String description, String category, double note, double price, int stock, String image) {
			super();
			this.title = title;
			this.author = author;
			this.description = description;
			this.category = category;
			this.note = note;
			this.price = price;
			this.stock = stock;
			this.image = image;
		}
		
		// Constructor without parameters
		public Book() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
		
		
		
		
		
}
