package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.repository.FeedBackRepository;
import sbi.company.service.DeleteFeedBackService;

@Service
public class DeleteFeedBackServiceImpl implements DeleteFeedBackService {

    @Autowired
    private FeedBackRepository repo;

    @Override
    public void deleteFeedBack(int id) {
        repo.deleteById(id);
    }
}
