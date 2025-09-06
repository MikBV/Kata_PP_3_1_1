package org.example.kata_pp_3_1_1.Repository;

import org.example.kata_pp_3_1_1.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
    void deleteByEmail(String email);
    User findById(int id);
}