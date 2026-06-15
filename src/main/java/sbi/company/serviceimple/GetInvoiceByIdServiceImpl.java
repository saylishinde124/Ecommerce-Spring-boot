package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Invoice;
import sbi.company.repository.InvoiceRepository;
import sbi.company.service.GetInvoiceByIdService;

@Service
public class GetInvoiceByIdServiceImpl implements GetInvoiceByIdService {

    @Autowired
    private InvoiceRepository repo;

    @Override
    public Invoice getInvoiceById(int id) {
        return repo.findById(id).orElse(null);
    }
}
