package com.aori.Test.repository;

import com.aori.Test.vo.TestId;
import com.aori.Test.vo.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository extends JpaRepository<Test, TestId> {
    @Query(value = "SELECT * FROM TEST T WHERE TEST_GROUP = :page", nativeQuery = true)
    List<Test> getQuestions(@Param("page") int page);
}
