package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Order;
import sbi.company.repository.OrderRepository;
import sbi.company.service.UpdateOrderService;

@Service
public class UpdateOrderServiceImpl implements UpdateOrderService {

    @Autowired
    private OrderRepository repo;

    @Override
    public Order updateOrder(Order order) {
        return repo.save(order);
    }
}
