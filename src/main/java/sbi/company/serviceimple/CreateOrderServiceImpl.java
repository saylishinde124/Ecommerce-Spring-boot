package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import sbi.company.entity.Order;

import sbi.company.repository.OrderRepository;
import sbi.company.service.CreateOrderService;

@Service
public class CreateOrderServiceImpl implements CreateOrderService {

    @Autowired
    private OrderRepository repo;

    @Override
    public Order saveOrder(Order order) {
        return repo.save(order);
    }
}
