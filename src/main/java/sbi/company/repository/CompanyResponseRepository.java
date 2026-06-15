package sbi.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sbi.company.entity.CompanyResponse;
@Repository

public interface CompanyResponseRepository extends JpaRepository<CompanyResponse, Integer> {
}

