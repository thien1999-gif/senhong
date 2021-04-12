package com.system.senhong.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_review")
public class ProductReview {

	@Id
	@Column(name = "product_review_id")
	private String product_review_id;
	
	@Column(name = "product_id")
	private String product_id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "rating")
	private double rating;
	
	@Column(name = "content")
	private String content;

	@Column(name = "count_rating")
	private int count_rating;

	public ProductReview() {
		super();
	}

	public String getProduct_review_id() {
		return product_review_id;
	}

	public void setProduct_review_id(String product_review_id) {
		this.product_review_id = product_review_id;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getCount_rating() {
		return count_rating;
	}

	public void setCount_rating(int count_rating) {
		this.count_rating = count_rating;
	}

	
	
	
}
