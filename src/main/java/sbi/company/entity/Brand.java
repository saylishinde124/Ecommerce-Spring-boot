package sbi.company.entity;

import java.util.List;
import jakarta.persistence.*;

@Entity
public class Brand {

    @Id
    private int bId;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Product> products;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Category> categories;

    @OneToMany(cascade = CascadeType.ALL)
    private List<SubCategory> subcategories;

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
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

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<SubCategory> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(List<SubCategory> subcategories) {
        this.subcategories = subcategories;
    }

    @Override
    public String toString() {
        return "Brand [bId=" + bId + ", name=" + name + ", products=" + products + ", categories=" + categories
                + ", subcategories=" + subcategories + "]";
    }
}