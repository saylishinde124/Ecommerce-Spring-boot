package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Card;
import sbi.company.repository.CardRepository;
import sbi.company.service.GetCardByIdService;

@Service
public class GetCardByIdServiceImpl implements GetCardByIdService {

    @Autowired
    private CardRepository repo;

    @Override
    public Card getCardById(int id) {
        return repo.findById(id).orElse(null);
    }
}
