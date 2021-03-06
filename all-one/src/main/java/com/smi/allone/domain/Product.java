package com.smi.allone.domain;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String productName;

	private String brand;

	private String size;

	private String color;

	private String warranty;

	private String price;

	private String description;

	private String stockLevel;

	private String stockSold;

	private String image;

	@JoinTable(name = "category_products", joinColumns = @JoinColumn(name = "pro_id"), inverseJoinColumns = {
			@JoinColumn(name = "cat_id", referencedColumnName = "id") })
	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	private Set<Category> category;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStockLevel() {
		return stockLevel;
	}

	public void setStockLevel(String stockLevel) {
		this.stockLevel = stockLevel;
	}

	public String getStockSold() {
		return stockSold;
	}

	public void setStockSold(String stockSold) {
		this.stockSold = stockSold;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Set<Category> getCategory() {
		return category;
	}

	public void setCategory(Set<Category> category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", brand=" + brand + ", size=" + size + ", color="
				+ color + ", warranty=" + warranty + ", price=" + price + ", description=" + description
				+ ", stockLevel=" + stockLevel + ", stockSold=" + stockSold + ", image=" + image + "]";
	}

}
