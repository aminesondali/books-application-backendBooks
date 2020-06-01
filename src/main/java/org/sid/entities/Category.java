package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints={@UniqueConstraint(columnNames = {"categoryName"})})
public class Category implements Serializable{

	    @Id @GeneratedValue
		private long id;
	    @Column(unique  = true)
		private String categoryName;
		
		//Getters and Setters
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getCategoryName() {
			return categoryName;
		}
		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}
		
		// Constructor with parameters
		public Category(String categoryName) {
			super();
			this.categoryName = categoryName;
		}
		
		// Constructor without parameters
		public Category() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
		
}
