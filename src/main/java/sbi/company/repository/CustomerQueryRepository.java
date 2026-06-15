package sbi.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sbi.company.entity.CustomerQuery;
@Repository

public interface CustomerQueryRepository extends JpaRepository<CustomerQuery, Integer> {
}
