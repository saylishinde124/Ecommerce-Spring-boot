package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.PaymentMode;
import sbi.company.repository.PaymentModeRepository;
import sbi.company.service.GetPaymentModeByIdService;

@Service
public class GetPaymentModeByIdServiceImpl implements GetPaymentModeByIdService {

    @Autowired
    private PaymentModeRepository repo;

    @Override
    public PaymentMode getPaymentModeById(int id) {
        return repo.findById(id).orElse(null);
    }
}
