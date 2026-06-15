package sbi.company.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Card;
import sbi.company.repository.CardRepository;
import sbi.company.service.GetAllCardService;

@Service
public class GetAllCardServiceImpl implements GetAllCardService {

    @Autowired
    private CardRepository repo;

    @Override
    public List<Card> getAllCards() {
        return repo.findAll();
    }
}
