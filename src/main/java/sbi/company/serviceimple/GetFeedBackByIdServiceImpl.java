package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.FeedBack;
import sbi.company.repository.FeedBackRepository;
import sbi.company.service.GetFeedBackByIdService;

@Service
public class GetFeedBackByIdServiceImpl implements GetFeedBackByIdService {

    @Autowired
    private FeedBackRepository repo;

    @Override
    public FeedBack getFeedBackById(int id) {
        return repo.findById(id).orElse(null);
    }
}
