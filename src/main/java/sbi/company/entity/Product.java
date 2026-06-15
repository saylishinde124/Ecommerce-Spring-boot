package sbi.company.entity;

import java.util.List;





import jakarta.persistence.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;




@Entity
public class Product {

    @Override
	public String toString() {
		return "Product [pId=" + pId + ", name=" + name + ", price=" + price + ", category=" + category + ", brand="
				+ brand + ", reviews=" + reviews + "]";
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Brand> getBrand() {
		return brand;
	}

	public void setBrand(List<Brand> brand) {
		this.brand = brand;
	}

	public List<ProductReview> getReviews() {
		return reviews;
	}

	public void setReviews(List<ProductReview> reviews) {
		this.reviews = reviews;
	}

	@Id
    private int pId;

    private String name;
    private float price;

    @OneToOne
    private Category category;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Brand> brand;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ProductReview> reviews;
}