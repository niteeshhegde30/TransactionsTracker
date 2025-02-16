package org.transactionsTracker.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.transactionsTracker.model.Transaction;

@Repository
public class TransactionDao {

    private final SqlSessionTemplate sqlSessionTemplate;

    @Autowired
    public TransactionDao(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate =sqlSessionTemplate;
    }

    public Transaction getTransactionById(int id) {
        return sqlSessionTemplate.selectOne("com.example.mapper.UserMapper.getUserById", id);
    }
}
