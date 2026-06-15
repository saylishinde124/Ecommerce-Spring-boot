package sbi.company.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.FeedBack;
import sbi.company.repository.FeedBackRepository;
import sbi.company.service.GetAllFeedBackService;

@Service
public class GetAllFeedBackServiceImpl implements GetAllFeedBackService {

    @Autowired
    private FeedBackRepository repo;

    @Override
    public List<FeedBack> getAllFeedBacks() {
        return repo.findAll();
    }
}
