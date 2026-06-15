package sbi.company.entity;

import java.util.List;



import jakarta.persistence.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;


@Entity
public class SubCategory {
	@Id
	private int sid;
	private String name;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Product> products;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Brand> brands;
	@Override
	public String toString() {
		return "SubCategory [sid=" + sid + ", name=" + name + ", products=" + products + ", brands=" + brands + "]";
	}
	public SubCategory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public List<Brand> getBrands() {
		return brands;
	}
	public void setBrands(List<Brand> brands) {
		this.brands = brands;
	}

}
