package sbi.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sbi.company.entity.Brand;
@Repository

public interface BrandRepository extends JpaRepository<Brand, Integer> {
}
