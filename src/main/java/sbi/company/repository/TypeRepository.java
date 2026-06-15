package sbi.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sbi.company.entity.Type;
public interface TypeRepository  extends JpaRepository<Type, Integer> {
}
