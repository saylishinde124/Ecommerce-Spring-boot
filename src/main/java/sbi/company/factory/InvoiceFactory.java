package sbi.company.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sbi.company.entity.Invoice;
import sbi.company.service.*;

@Component
public class InvoiceFactory {

    @Autowired
    private CreateInvoiceService createService;

    @Autowired
    private UpdateInvoiceService updateService;

    @Autowired
    private DeleteInvoiceService deleteService;

    @Autowired
    private GetInvoiceByIdService getByIdService;

    @Autowired
    private GetAllInvoiceService getAllService;

    public Object execute(int choice, Invoice invoice, Integer id) {

        switch (choice) {

            case 1:
                return createService.saveInvoice(invoice);

            case 2:
                return updateService.updateInvoice(invoice);

            case 3:
                deleteService.deleteInvoice(id);
                return "Invoice Deleted Successfully";

            case 4:
                return getByIdService.getInvoiceById(id);

            case 5:
                return getAllService.getAllInvoices();

            default:
                return "Invalid Choice";
        }
    }
}