package org.transactionsTracker.service;

import org.transactionsTracker.model.Transaction;
import org.transactionsTracker.model.TransactionsFilter;

import java.util.List;

// TODO: write documentation
public interface TransactionService {
    List<Transaction> addTransactions(List<Transaction> transactions);

    List<Transaction> readTransactions(TransactionsFilter filter);

    List<Transaction> updateTransactions(List<Transaction> transactions);

    List<Transaction> deleteTransactions(List<Transaction> transactions);

}
