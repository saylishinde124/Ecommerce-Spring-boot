package sbi.company.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Order;
import sbi.company.repository.OrderRepository;
import sbi.company.service.GetAllOrderService;

@Service
public class GetAllOrderServiceImpl implements GetAllOrderService {

    @Autowired
    private OrderRepository repo;

    @Override
    public List<Order> getAllOrders() {
        return repo.findAll();
    }
}
