package com.system.senhong.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "card_item")
public class CartItem {
	@Id
	@Column(name = "card_item_id")
	private String card_item_id;

	@Column(name = "product_id")
	private String product_id;

	@Column(name = "card_id")
	private String card_id;

	@Column(name = "product_name")
	private String product_name;

	@Column(name = "price")
	private double price;

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "content")
	private String content;

	public CartItem() {
		super();
	}

	public String getCard_item_id() {
		return card_item_id;
	}

	public void setCard_item_id(String card_item_id) {
		this.card_item_id = card_item_id;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getCard_id() {
		return card_id;
	}

	public void setCard_id(String card_id) {
		this.card_id = card_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	

	
	
}
