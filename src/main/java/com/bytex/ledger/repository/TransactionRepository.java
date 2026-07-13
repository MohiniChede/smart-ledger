package com.bytex.ledger.repository;

import com.bytex.ledger.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    // This interface inherits all CRUD operations from JpaRepository automatically
}