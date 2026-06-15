package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.repository.CardRepository;
import sbi.company.service.DeleteCardService;

@Service
public class DeleteCardServiceImpl implements DeleteCardService {

    @Autowired
    private CardRepository repo;

    @Override
    public void deleteCard(int id) {
        repo.deleteById(id);
    }
}
