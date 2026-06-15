package sbi.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sbi.company.entity.Cod;
@Repository

public interface CodRepository extends JpaRepository<Cod, Integer> {
}
