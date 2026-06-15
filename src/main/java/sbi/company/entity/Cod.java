package sbi.company.entity;

import jakarta.persistence.*;

@Entity
public class Cod {

    @Id
    private int cid;

    private float amount;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}