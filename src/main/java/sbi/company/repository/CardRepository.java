package sbi.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sbi.company.entity.Card;
@Repository

public interface CardRepository extends JpaRepository<Card, Integer> {
}
