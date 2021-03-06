package com.howard.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j  
@Data 
@Entity
@Table(name ="article")
public class Article  {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column 
	private int id;
	@Column
	private String articleTitle;
	@Column
	private String articleCreateDate;
	@Column
	private String articleContent;
	@Column
	private int isTop;
	@Column
	private String addName;
	
	public Article(){}
}
