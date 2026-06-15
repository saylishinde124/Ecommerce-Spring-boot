package sbi.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sbi.company.entity.Upi;
public interface UpiRepository  extends JpaRepository<Upi, Integer> {
}
