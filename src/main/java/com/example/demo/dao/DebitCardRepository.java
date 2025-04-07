package com.example.demo.dao;

import com.example.demo.dao.entity.DebitCardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DebitCardRepository extends JpaRepository<DebitCardEntity, String> {

}
