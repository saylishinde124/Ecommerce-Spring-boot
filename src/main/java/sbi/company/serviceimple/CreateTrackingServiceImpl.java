package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Tracking;
import sbi.company.repository.TrackingRepository;
import sbi.company.service.CreateTrackingService;

@Service
public class CreateTrackingServiceImpl implements CreateTrackingService {

    @Autowired
    private TrackingRepository repo;

    @Override
    public Tracking saveTracking(Tracking tracking) {
        return repo.save(tracking);
    }
}
