package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.FeedBack;
import sbi.company.repository.FeedBackRepository;
import sbi.company.service.UpdateFeedBackService;

@Service
public class UpdateFeedBackServiceImpl implements UpdateFeedBackService {

    @Autowired
    private FeedBackRepository repo;

    @Override
    public FeedBack updateFeedBack(FeedBack fb) {
        return repo.save(fb);
    }
}
