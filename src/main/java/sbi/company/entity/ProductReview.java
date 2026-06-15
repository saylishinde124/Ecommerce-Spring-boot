package sbi.company.entity;






import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.OneToOne;

@Entity
public class ProductReview {
	@Override
	public String toString() {
		return "ProductReview [prId=" + prId + ", review=" + review + ", Product=" + Product + "]";
	}
	public ProductReview() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPrId() {
		return prId;
	}
	public void setPrId(int prId) {
		this.prId = prId;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public Product getProduct() {
		return Product;
	}
	public void setProduct(Product product) {
		Product = product;
	}
	@Id
	private int prId;
	private String review;
	@OneToOne
	private Product Product;


}
