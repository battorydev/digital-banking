package com.example.demo.dao;

import com.example.demo.dao.entity.DebitCardDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DebitCardDetailRepository extends JpaRepository<DebitCardDetailEntity, String> {

}
