package com.example.demo.dao;

import com.example.demo.dao.entity.AccountDetailBalanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDetailBalanceRepository extends JpaRepository<AccountDetailBalanceEntity, String> {

}
