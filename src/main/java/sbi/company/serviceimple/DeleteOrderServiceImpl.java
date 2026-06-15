package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.repository.OrderRepository;
import sbi.company.service.DeleteOrderService;

@Service
public class DeleteOrderServiceImpl implements DeleteOrderService {

    @Autowired
    private OrderRepository repo;

    @Override
    public void deleteOrder(int id) {
        repo.deleteById(id);
    }
}
