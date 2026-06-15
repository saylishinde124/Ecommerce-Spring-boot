package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import sbi.company.entity.Card;

import sbi.company.repository.CardRepository;
import sbi.company.service.CreateCardService;

@Service
public class CreateCardServiceImpl implements CreateCardService {

    @Autowired
    private CardRepository repo;

    @Override
    public Card saveCard(Card card) {
        return repo.save(card);
    }
}
