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

    public List<Transaction> findTransactionById(int id){
        return sqlSessionTemplate.selectList("org.transactionsTracker.mappers.TransactionMapper.findTransactionById", id);
    }

    public List<Transaction> getAllTransactions(){
        return sqlSessionTemplate.selectList("org.transactionsTracker.mappers.TransactionMapper.getAllTransactions");
    }

    public List<Transaction> findTransactionForFilter(TransactionsFilter filter){
        return sqlSessionTemplate.selectList("org.transactionsTracker.mappers.TransactionMapper.findTransactionForFilter", filter);
    }

    public List<Transaction> insertTransactions(List<Transaction> transactions){
        sqlSessionTemplate.insert("org.transactionsTracker.mappers.TransactionMapper.insertTransactions", transactions);
//        sqlSessionTemplate.commit();
        return transactions;
    }
}
