package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.ShippingDetails;
import sbi.company.repository.ShippingDetailsRepository;
import sbi.company.service.CreateShippingDetailsService;

@Service
public class CreateShippingDetailsServiceImpl implements CreateShippingDetailsService {

    @Autowired
    private ShippingDetailsRepository repo;

    @Override
    public ShippingDetails saveShippingDetails(ShippingDetails sd) {
        return repo.save(sd);
    }
}
