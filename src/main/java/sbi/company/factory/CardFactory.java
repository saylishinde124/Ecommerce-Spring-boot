package sbi.company.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sbi.company.entity.Card;
import sbi.company.service.*;

@Component
public class CardFactory {

    @Autowired
    private CreateCardService createService;

    @Autowired
    private UpdateCardService updateService;

    @Autowired
    private DeleteCardService deleteService;

    @Autowired
    private GetCardByIdService getByIdService;

    @Autowired
    private GetAllCardService getAllService;

    public Object execute(int choice, Card card, Integer id) {

        switch (choice) {

            case 1:
                return createService.saveCard(card);

            case 2:
                return updateService.updateCard(card);

            case 3:
                deleteService.deleteCard(id);
                return "Card deleted successfully";

            case 4:
                return getByIdService.getCardById(id);

            case 5:
                return getAllService.getAllCards();

            default:
                return "Invalid Choice";
        }
    }
}