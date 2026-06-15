package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Card;
import sbi.company.repository.CardRepository;
import sbi.company.service.UpdateCardService;

@Service
public class UpdateCardServiceImpl implements UpdateCardService {

    @Autowired
    private CardRepository repo;

    @Override
    public Card updateCard(Card card) {
        return repo.save(card);
    }
}
