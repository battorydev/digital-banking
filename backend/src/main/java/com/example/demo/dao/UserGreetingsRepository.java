package com.example.demo.dao;

import com.example.demo.dao.entity.UserGreetingsEntity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserGreetingsRepository extends JpaRepository<UserGreetingsEntity, String> {

  Optional<UserGreetingsEntity> findByUserId(String testUser);
}
