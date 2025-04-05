package com.example.demo.dao;

import com.example.demo.dao.entity.DebitCardDesignEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DebitCardDesignRepository extends JpaRepository<DebitCardDesignEntity, String> {

}
