package sbi.company.entity;

import jakarta.persistence.*;

@Entity
public class CustomerQuery {

    @Id
    private int id;

    @OneToOne
    private ShippingDetails shippingdetails;

    @OneToOne
    private Invoice invoice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ShippingDetails getShippingdetails() {
        return shippingdetails;
    }

    public void setShippingdetails(ShippingDetails shippingdetails) {
        this.shippingdetails = shippingdetails;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}