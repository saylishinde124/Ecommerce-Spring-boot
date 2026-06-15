package sbi.company.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sbi.company.entity.Order;
import sbi.company.service.*;

@Component
public class OrderFactory {

    @Autowired
    private CreateOrderService createService;

    @Autowired
    private UpdateOrderService updateService;

    @Autowired
    private DeleteOrderService deleteService;

    @Autowired
    private GetOrderByIdService getByIdService;

    @Autowired
    private GetAllOrderService getAllService;

    public Object execute(int choice, Order order, Integer id) {

        switch (choice) {

            case 1:
                return createService.saveOrder(order);

            case 2:
                return updateService.updateOrder(order);

            case 3:
                deleteService.deleteOrder(id);
                return "Order Deleted Successfully";

            case 4:
                return getByIdService.getOrderById(id);

            case 5:
                return getAllService.getAllOrders();

            default:
                return "Invalid Choice";
        }
    }
}