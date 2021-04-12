package com.system.senhong.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_category")
public class ProductCategory {
	
	@Id
	@Column(name = "product_category_id")
	private String product_category_id;
	
	@Column(name = "product_category")
	private String product_category;
	
	@Column(name = "status")
	private int status;

	public ProductCategory() {
		super();
	}

	public String getProduct_category_id() {
		return product_category_id;
	}

	public void setProduct_category_id(String product_category_id) {
		this.product_category_id = product_category_id;
	}

	public String getProduct_category() {
		return product_category;
	}

	public void setProduct_category(String product_category) {
		this.product_category = product_category;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	
	

}
