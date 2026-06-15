package sbi.company.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.ShippingDetails;
import sbi.company.repository.ShippingDetailsRepository;
import sbi.company.service.GetAllShippingDetailsService;

@Service
public class GetAllShippingDetailsServiceImpl implements GetAllShippingDetailsService {

    @Autowired
    private ShippingDetailsRepository repo;

    @Override
    public List<ShippingDetails> getAllShippingDetails() {
        return repo.findAll();
    }
}
