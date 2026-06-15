package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Tracking;
import sbi.company.repository.TrackingRepository;
import sbi.company.service.UpdateTrackingService;

@Service
public class UpdateTrackingServiceImpl implements UpdateTrackingService {

    @Autowired
    private TrackingRepository repo;

    @Override
    public Tracking updateTracking(Tracking tracking) {
        return repo.save(tracking);
    }
}
