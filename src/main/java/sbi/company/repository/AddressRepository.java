package sbi.company.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sbi.company.entity.Address;
@Repository

public interface AddressRepository extends JpaRepository<Address, Integer> {
}