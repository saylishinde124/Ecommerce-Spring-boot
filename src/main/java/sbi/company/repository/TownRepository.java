package sbi.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sbi.company.entity.Town;
public interface TownRepository  extends JpaRepository<Town, Integer> {
}
