package org.example.kata_pp_3_1_1.Repository;

import org.example.kata_pp_3_1_1.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
    User findByEmail(String email);
    void deleteByUsername(String username);
    void addUser(User user);
}
