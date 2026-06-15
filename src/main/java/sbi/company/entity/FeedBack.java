package sbi.company.entity;

import java.util.List;
import jakarta.persistence.*;

@Entity
public class FeedBack {

    @Id
    private int id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<CustomerQuery> cquery;

    @OneToMany(cascade = CascadeType.ALL)
    private List<CompanyResponse> cResponse;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<CustomerQuery> getCquery() {
        return cquery;
    }

    public void setCquery(List<CustomerQuery> cquery) {
        this.cquery = cquery;
    }

    public List<CompanyResponse> getcResponse() {
        return cResponse;
    }

    public void setcResponse(List<CompanyResponse> cResponse) {
        this.cResponse = cResponse;
    }
}