package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.ShippingDetails;
import sbi.company.repository.ShippingDetailsRepository;
import sbi.company.service.GetShippingDetailsByIdService;

@Service
public class GetShippingDetailsByIdServiceImpl implements GetShippingDetailsByIdService {

    @Autowired
    private ShippingDetailsRepository repo;

    @Override
    public ShippingDetails getShippingDetailsById(int id) {
        return repo.findById(id).orElse(null);
    }
}
