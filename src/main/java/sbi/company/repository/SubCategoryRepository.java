package sbi.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sbi.company.entity.SubCategory;
public interface SubCategoryRepository  extends JpaRepository<SubCategory, Integer> {
}
