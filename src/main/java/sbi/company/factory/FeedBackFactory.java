package sbi.company.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sbi.company.entity.FeedBack;
import sbi.company.service.*;

@Component
public class FeedBackFactory {

    @Autowired
    private CreateFeedBackService createService;

    @Autowired
    private UpdateFeedBackService updateService;

    @Autowired
    private DeleteFeedBackService deleteService;

    @Autowired
    private GetFeedBackByIdService getByIdService;

    @Autowired
    private GetAllFeedBackService getAllService;

    public Object execute(int choice, FeedBack fb, Integer id) {

        switch (choice) {

            case 1:
                return createService.saveFeedBack(fb);

            case 2:
                return updateService.updateFeedBack(fb);

            case 3:
                deleteService.deleteFeedBack(id);
                return "FeedBack Deleted Successfully";

            case 4:
                return getByIdService.getFeedBackById(id);

            case 5:
                return getAllService.getAllFeedBacks();

            default:
                return "Invalid Choice";
        }
    }
}
