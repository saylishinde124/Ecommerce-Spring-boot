package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import sbi.company.entity.PaymentMode;

import sbi.company.repository.PaymentModeRepository;
import sbi.company.service.CreatePaymentModeService;

@Service
public class CreatePaymentModeServiceImpl implements CreatePaymentModeService {

    @Autowired
    private PaymentModeRepository repo;

    @Override
    public PaymentMode savePaymentMode(PaymentMode pm) {
        return repo.save(pm);
    }
}