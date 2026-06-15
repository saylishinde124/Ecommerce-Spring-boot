package sbi.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sbi.company.entity.Owner;
@Repository

public interface OwnerRepository  extends JpaRepository<Owner, Integer> {
}
