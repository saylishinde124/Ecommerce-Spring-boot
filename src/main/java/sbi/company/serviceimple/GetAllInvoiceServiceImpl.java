package sbi.company.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Invoice;
import sbi.company.repository.InvoiceRepository;
import sbi.company.service.GetAllInvoiceService;

@Service
public class GetAllInvoiceServiceImpl implements GetAllInvoiceService {

    @Autowired
    private InvoiceRepository repo;

    @Override
    public List<Invoice> getAllInvoices() {
        return repo.findAll();
    }
}
