package com.example.demo.dao;

import com.example.demo.dao.entity.AccountDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDetailRepository extends JpaRepository<AccountDetailEntity, String> {

}
