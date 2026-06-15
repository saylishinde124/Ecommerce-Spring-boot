package sbi.company.entity;

import java.util.List;
import java.util.Set;
import jakarta.persistence.*;

@Entity
public class Invoice {

    @Id
    private int iid;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Product> products;

    @ManyToOne
    private PaymentMode paymentmode;

    @ManyToMany
    private Set<ShippingDetails> shippingDetails;

    @OneToOne
    private Tracking tracking;

    public int getIid() {
        return iid;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public PaymentMode getPaymentmode() {
        return paymentmode;
    }

    public void setPaymentmode(PaymentMode paymentmode) {
        this.paymentmode = paymentmode;
    }

    public Set<ShippingDetails> getShippingDetails() {
        return shippingDetails;
    }

    public void setShippingDetails(Set<ShippingDetails> shippingDetails) {
        this.shippingDetails = shippingDetails;
    }

    public Tracking getTracking() {
        return tracking;
    }

    public void setTracking(Tracking tracking) {
        this.tracking = tracking;
    }
}