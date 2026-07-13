package com.bytex.ledger.controller;

import com.bytex.ledger.entity.Transaction;
import com.bytex.ledger.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/transactions")
@CrossOrigin(origins = "*")
public class TransactionController {

    @Autowired
    private TransactionRepository repository;

    @GetMapping
    public List<Transaction> getAllTransactions() {
        return repository.findAll();
    }

    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        transaction.setCreatedAt(LocalDateTime.now());

        if ("EXPENSE".equalsIgnoreCase(transaction.getType()) && transaction.getAmount() >= 10000) {
            triggerInternalAlert(transaction);
        }

        return repository.save(transaction);
    }

    private void triggerInternalAlert(Transaction transaction) {
        System.out.println("🚨 [ALERT SYSTEM] High-value expense detected!");
        System.out.println("Description: " + transaction.getDescription() + " | Amount: INR " + transaction.getAmount());
    }
}