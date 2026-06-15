package sbi.company.service;

import sbi.company.entity.Order;

public interface CreateOrderService {
    Order saveOrder(Order order);
}
