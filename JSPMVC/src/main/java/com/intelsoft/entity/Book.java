package com.intelsoft.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor

@Table(name="Book_Information")
public class Book {
	
	@Id
	@GeneratedValue
	private Integer bookId;
	private String bookName;
	private Double bookPrice;
	
	

}
