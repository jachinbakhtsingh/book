package com.book2.book2api.entity;

public class book {
    private Integer id;
    private String name;
    private String desc;
    private Integer yearofpublication;
    private String booktype;

    public book(Integer id, String name, String desc, Integer yearofpublication, String booktype) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.yearofpublication = yearofpublication;
        this.booktype = booktype;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getYearofpublication() {
        return yearofpublication;
    }

    public void setYearofpublication(Integer yearofpublication) {
        this.yearofpublication = yearofpublication;
    }

    public String getBooktype() {
        return booktype;
    }

    public void setBooktype(String booktype) {
        this.booktype = booktype;
    }
}
