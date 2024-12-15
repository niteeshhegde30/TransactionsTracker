package org.transactionsTracker.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.transactionsTracker.model.Transaction;
import org.transactionsTracker.model.TransactionsFilter;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/transactionService")
@Component
@Scope("prototype")
public class TransactionServiceImpl implements TransactionService{

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @Override
    @PostMapping
    public List<Transaction> addTransactions(List<Transaction> transactions) {
        Transaction transaction = new Transaction(10.0, new Date());
        return List.of(transaction);
    }

    @Override
    @GetMapping
    public List<Transaction> readTransactions(TransactionsFilter filter) {
        Transaction transaction = new Transaction(20.0, new Date());
        return List.of(transaction);
    }

    @Override
    public List<Transaction> updateTransactions(List<Transaction> transactions) {
        return null;
    }

    @Override
    public List<Transaction> deleteTransactions(List<Transaction> transactions) {
        return null;
    }
}
