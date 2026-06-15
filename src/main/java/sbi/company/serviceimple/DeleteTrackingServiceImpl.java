package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.repository.TrackingRepository;
import sbi.company.service.DeleteTrackingService;

@Service
public class DeleteTrackingServiceImpl implements DeleteTrackingService {

    @Autowired
    private TrackingRepository repo;

    @Override
    public void deleteTracking(int id) {
        repo.deleteById(id);
    }
}
