package com.example.demo.dao;

import com.example.demo.dao.entity.AccountBalanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountBalanceRepository extends JpaRepository<AccountBalanceEntity, Long> {

}
