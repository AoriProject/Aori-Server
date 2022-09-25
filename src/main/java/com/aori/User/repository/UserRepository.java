package com.aori.User.repository;

import com.aori.User.vo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Override
    Optional<User> findById(Long id);

    @Query(value = "SELECT COUNT(1) FROM USER U WHERE TEST_LINK = :link", nativeQuery = true)
    Long countTestLink(@Param("link") String link);

    @Query(value = "SELECT COUNT(1) FROM USER U WHERE RESULT_LINK = :link", nativeQuery = true)
    Long countResultLink(@Param("link") String link);
}
