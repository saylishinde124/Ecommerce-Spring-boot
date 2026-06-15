package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import sbi.company.entity.FeedBack;

import sbi.company.repository.FeedBackRepository;
import sbi.company.service.CreateFeedBackService;

@Service
public class CreateFeedBackServiceImpl implements CreateFeedBackService {

    @Autowired
    private FeedBackRepository repo;

    @Override
    public FeedBack saveFeedBack(FeedBack feedBack) {
        return repo.save(feedBack);
    }
}