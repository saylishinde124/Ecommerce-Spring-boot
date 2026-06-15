package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Invoice;
import sbi.company.repository.InvoiceRepository;
import sbi.company.service.UpdateInvoiceService;

@Service
public class UpdateInvoiceServiceImpl implements UpdateInvoiceService {

    @Autowired
    private InvoiceRepository repo;

    @Override
    public Invoice updateInvoice(Invoice invoice) {
        return repo.save(invoice);
    }
}
