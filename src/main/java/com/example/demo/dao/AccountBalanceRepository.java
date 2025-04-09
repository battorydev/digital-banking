package com.example.demo.dao;

import com.example.demo.dao.entity.AccountBalanceEntity;
import java.math.BigDecimal;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountBalanceRepository extends JpaRepository<AccountBalanceEntity, Long> {

  Optional<AccountBalanceEntity> findByUserIdAndAccountId(String testUser, String accountId);

  @Query(value="select sum(ab.amount)\n"
      + "from springboot.account_balances ab\n"
      + "where ab.user_id = ?1\n"
      + "group by ab.user_id;", nativeQuery = true)
  BigDecimal getBalance(String testUser);
}
