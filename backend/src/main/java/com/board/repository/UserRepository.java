package com.board.repository;
import com.board.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

  @Query("SELECT u, r FROM User u JOIN FETCH u.roles r WHERE u.username = :username")
  Optional<User> findByUsername(@Param("username") String username);

  boolean existsByUsername(String username);

}
