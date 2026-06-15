package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Tracking;
import sbi.company.repository.TrackingRepository;
import sbi.company.service.GetTrackingByIdService;

@Service
public class GetTrackingByIdServiceImpl implements GetTrackingByIdService {

    @Autowired
    private TrackingRepository repo;

    @Override
    public Tracking getTrackingById(int id) {
        return repo.findById(id).orElse(null);
    }
}
