package com.example.demo.dao;

import com.example.demo.dao.entity.DebitCardStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DebitCardStatusRepository extends JpaRepository<DebitCardStatusEntity, String> {

}
