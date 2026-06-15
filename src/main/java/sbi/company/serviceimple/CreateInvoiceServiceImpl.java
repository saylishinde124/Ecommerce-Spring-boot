package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import sbi.company.entity.Invoice;

import sbi.company.repository.InvoiceRepository;
import sbi.company.service.CreateInvoiceService;

@Service
public class CreateInvoiceServiceImpl implements CreateInvoiceService {

    @Autowired
    private InvoiceRepository repo;

    @Override
    public Invoice saveInvoice(Invoice invoice) {
        return repo.save(invoice);
    }
}
