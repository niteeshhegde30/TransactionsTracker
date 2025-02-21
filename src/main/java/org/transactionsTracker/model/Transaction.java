package org.transactionsTracker.model;

import java.util.Date;

public class Transaction {
    private int id;
    private double amount;
    private Date date;
    private String comment;
    private String category;
    private String subCategory;

    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public String getComment() {
        return comment;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }
}
