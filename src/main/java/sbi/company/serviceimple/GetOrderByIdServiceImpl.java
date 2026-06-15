package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Order;
import sbi.company.repository.OrderRepository;
import sbi.company.service.GetOrderByIdService;

@Service
public class GetOrderByIdServiceImpl implements GetOrderByIdService {

    @Autowired
    private OrderRepository repo;

    @Override
    public Order getOrderById(int id) {
        return repo.findById(id).orElse(null);
    }
}
