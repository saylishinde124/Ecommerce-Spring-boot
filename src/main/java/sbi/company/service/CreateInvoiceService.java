package sbi.company.service;

import sbi.company.entity.Invoice;

public interface CreateInvoiceService {
    Invoice saveInvoice(Invoice invoice);
}
