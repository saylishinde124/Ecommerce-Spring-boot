package sbi.company.entity;

import java.util.Set;
import jakarta.persistence.*;

@Entity
public class CompanyResponse {

    @Id
    private int id;

    @ManyToMany(targetEntity = CustomerQuery.class)
    private Set<CustomerQuery> cQuery;

    private String msg;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<CustomerQuery> getcQuery() {
        return cQuery;
    }

    public void setcQuery(Set<CustomerQuery> cQuery) {
        this.cQuery = cQuery;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}