package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.PaymentMode;
import sbi.company.repository.PaymentModeRepository;
import sbi.company.service.UpdatePaymentModeService;

@Service
public class UpdatePaymentModeServiceImpl implements UpdatePaymentModeService {

    @Autowired
    private PaymentModeRepository repo;

    @Override
    public PaymentMode updatePaymentMode(PaymentMode pm) {
        return repo.save(pm);
    }
}
