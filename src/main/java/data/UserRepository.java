package data;

import model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Long, User> {

    Optional<User> findUserByUsername(String username);

    User findUserById(Long id);
}
