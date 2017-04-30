package ddd.repository;

import ddd.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
     User findByEmail(String email);
       //User findByName(String username);

}