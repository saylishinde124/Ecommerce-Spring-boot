package sbi.company.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Tracking;
import sbi.company.repository.TrackingRepository;
import sbi.company.service.GetAllTrackingService;

@Service
public class GetAllTrackingServiceImpl implements GetAllTrackingService {

    @Autowired
    private TrackingRepository repo;

    @Override
    public List<Tracking> getAllTrackings() {
        return repo.findAll();
    }
}
