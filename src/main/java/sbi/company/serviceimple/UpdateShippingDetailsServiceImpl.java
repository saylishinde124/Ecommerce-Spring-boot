package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.ShippingDetails;
import sbi.company.repository.ShippingDetailsRepository;
import sbi.company.service.UpdateShippingDetailsService;

@Service
public class UpdateShippingDetailsServiceImpl implements UpdateShippingDetailsService {

    @Autowired
    private ShippingDetailsRepository repo;

    @Override
    public ShippingDetails updateShippingDetails(ShippingDetails sd) {
        return repo.save(sd);
    }
}