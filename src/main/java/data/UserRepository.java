package data;

import model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Long, User> {

    User findUserByUsername(String username);

    User findUserById(Long id);
}
