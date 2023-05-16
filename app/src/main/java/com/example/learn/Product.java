package com.example.learn;

public class Product extends parent{
    //Lấy tham chiếu để lập trình cho lẹ
    private Catalog Dmuc;

    public Catalog getDmuc() {
        return Dmuc;
    }

    public void setDmuc(Catalog dmuc) {
        Dmuc = dmuc;
    }

    public Product(String ma, String name, Catalog dmuc) {
        super(ma, name);
        Dmuc = dmuc;
    }

    public Product(String ma, String name) {
        super(ma, name);
    }

    public Product() {
        super();
    }
}
