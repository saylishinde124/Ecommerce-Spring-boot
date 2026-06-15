package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.repository.ShippingDetailsRepository;
import sbi.company.service.DeleteShippingDetailsService;

@Service
public class DeleteShippingDetailsServiceImpl implements DeleteShippingDetailsService {

    @Autowired
    private ShippingDetailsRepository repo;

    @Override
    public void deleteShippingDetails(int id) {
        repo.deleteById(id);
    }
}
