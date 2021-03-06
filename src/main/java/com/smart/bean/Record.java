package com.smart.bean;

import java.io.Serializable;

public class Record implements Serializable {

    /**
     * 使用jedis 需要序列化接口
     */
    private static final long serialVersionUID = 1L;
    private int id;
    private String bookId;
    private String geName;
    private String geNumber;
    private String bookName;
    private String applyTime;
    private String lendTime;
    private String state;
    private String description;
    private String backTime;

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBackTime(String backTime) {
        this.backTime = backTime;
    }

    public String getBackTime() {
        return backTime;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setGeName(String geName) {
        this.geName = geName;
    }

    public void setGeNumber(String geNumber) {
        this.geNumber = geNumber;
    }

    public void setLendTime(String lendTime) {
        this.lendTime = lendTime;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getBookId() {
        return bookId;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getGeName() {
        return geName;
    }

    public String getGeNumber() {
        return geNumber;
    }

    public String getLendTime() {
        return lendTime;
    }

    public String getState() {
        return state;
    }

}
