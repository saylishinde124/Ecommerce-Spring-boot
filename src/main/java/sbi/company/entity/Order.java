package sbi.company.entity;

import java.util.Set;
import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    private int oId;

    private String name;

    @ManyToOne
    private PaymentMode paymentmode;

    @ManyToMany
    private Set<ShippingDetails> shippingDetails;

    @ManyToMany
    private Set<Invoice> invoice;

    @ManyToMany
    private Set<Tracking> tracking;

    public int getoId() {
        return oId;
    }

    public void setoId(int oId) {
        this.oId = oId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Set<Invoice> getInvoice() {
        return invoice;
    }

    public void setInvoice(Set<Invoice> invoice) {
        this.invoice = invoice;
    }

    public Set<Tracking> getTracking() {
        return tracking;
    }

    public void setTracking(Set<Tracking> tracking) {
        this.tracking = tracking;
    }
}