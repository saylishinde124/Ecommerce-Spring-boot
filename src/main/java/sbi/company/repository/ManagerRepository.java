package sbi.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sbi.company.entity.Manager;

@Repository

public interface ManagerRepository extends JpaRepository<Manager, Integer> {
}
