package sbi.company.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sbi.company.entity.PaymentMode;
import sbi.company.service.*;

@Component
public class PaymentModeFactory {

    @Autowired
    private CreatePaymentModeService createService;

    @Autowired
    private UpdatePaymentModeService updateService;

    @Autowired
    private DeletePaymentModeService deleteService;

    @Autowired
    private GetPaymentModeByIdService getByIdService;

    @Autowired
    private GetAllPaymentModeService getAllService;

    public Object execute(int choice, PaymentMode pm, Integer id) {

        switch (choice) {

            case 1:
                return createService.savePaymentMode(pm);

            case 2:
                return updateService.updatePaymentMode(pm);

            case 3:
                deleteService.deletePaymentMode(id);
                return "PaymentMode Deleted Successfully";

            case 4:
                return getByIdService.getPaymentModeById(id);

            case 5:
                return getAllService.getAllPaymentModes();

            default:
                return "Invalid Choice";
        }
    }
}
