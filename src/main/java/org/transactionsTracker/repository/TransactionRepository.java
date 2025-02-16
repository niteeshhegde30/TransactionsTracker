package org.transactionsTracker.repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
import org.transactionsTracker.model.Transaction;
import org.transactionsTracker.model.TransactionsFilter;

import java.util.List;

@Repository
public class TransactionRepository {
    private final SqlSessionTemplate sqlSessionTemplate;

    public TransactionRepository(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public List<Transaction> findTransactionForFilter(TransactionsFilter filter){
        return sqlSessionTemplate.selectList("org.transactionsTracker.mappers.TransactionMapper.findTransactionForFilter", filter);
    }

    public List<Transaction> insertTransactions(List<Transaction> transactions){
        sqlSessionTemplate.insert("org.transactionsTracker.mappers.TransactionMapper.insertTransactions", transactions);
        return transactions;
    }
}
