package com.example.learn;
//class dung chung
public class parent {
    //Id để lưu mã
    //Name để lưu tên
    private String id;
    private String name;
    public String getid() {
        return id;
    }
    public void setid(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public parent(String id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    public parent() {
        super();
    }
    public String toString() {
        return this.id+" - "+this.name;
    }
}
