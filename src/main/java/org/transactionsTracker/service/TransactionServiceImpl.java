package org.transactionsTracker.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.transactionsTracker.model.Transaction;
import org.transactionsTracker.model.TransactionsFilter;
import org.transactionsTracker.repository.TransactionRepository;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/transactionService")
@Component
@Scope("prototype")
public class TransactionServiceImpl implements TransactionService{

    private final TransactionRepository transactionRepository;

    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @PostMapping("/something")
    String something() {
        return "something Hello World!";
    }

    @Override
    @PostMapping("/addTransactions")
    public List<Transaction> addTransactions(@RequestBody List<Transaction> transactions) {
        return transactionRepository.insertTransactions(transactions);
    }

    @Override
    @GetMapping("/readTransactions")
    public List<Transaction> readTransactions(@ModelAttribute TransactionsFilter filter) {
        return transactionRepository.findTransactionForFilter(filter);
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
