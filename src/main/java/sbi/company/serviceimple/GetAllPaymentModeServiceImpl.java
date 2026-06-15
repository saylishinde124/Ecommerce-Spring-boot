package sbi.company.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.PaymentMode;
import sbi.company.repository.PaymentModeRepository;
import sbi.company.service.GetAllPaymentModeService;

@Service
public class GetAllPaymentModeServiceImpl implements GetAllPaymentModeService {

    @Autowired
    private PaymentModeRepository repo;

    @Override
    public List<PaymentMode> getAllPaymentModes() {
        return repo.findAll();
    }
}
