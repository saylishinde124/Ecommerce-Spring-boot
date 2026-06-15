package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.repository.PaymentModeRepository;
import sbi.company.service.DeletePaymentModeService;

@Service
public class DeletePaymentModeServiceImpl implements DeletePaymentModeService {

    @Autowired
    private PaymentModeRepository repo;

    @Override
    public void deletePaymentMode(int id) {
        repo.deleteById(id);
    }
}
