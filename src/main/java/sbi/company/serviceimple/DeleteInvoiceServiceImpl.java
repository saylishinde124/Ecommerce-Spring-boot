package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.repository.InvoiceRepository;
import sbi.company.service.DeleteInvoiceService;

@Service
public class DeleteInvoiceServiceImpl implements DeleteInvoiceService {

    @Autowired
    private InvoiceRepository repo;

    @Override
    public void deleteInvoice(int id) {
        repo.deleteById(id);
    }
}
