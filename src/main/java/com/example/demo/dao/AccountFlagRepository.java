package com.example.demo.dao;

import com.example.demo.dao.entity.AccountFlagEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountFlagRepository extends JpaRepository<AccountFlagEntity, String> {

}
