package sbi.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sbi.company.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
