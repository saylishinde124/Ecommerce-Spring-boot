package sbi.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sbi.company.entity.Tracking;
public interface TrackingRepository  extends JpaRepository<Tracking, Integer> {
}