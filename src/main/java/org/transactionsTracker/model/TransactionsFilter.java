package org.transactionsTracker.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class TransactionsFilter {
    private Double amount;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;
    private String comment;

    TransactionsFilter(){}

    public TransactionsFilter(Double amount, Date startDate, Date endDate, String comment) {
        this.amount = amount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.comment = comment;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
