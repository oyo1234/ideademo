package com.newer.Ram;

public class KingmaxRam implements Ram{

    private int size;
    private String name;
    private double price;
    private String company;

    public void setSize(int size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public int getSize() {

        return 0;
    }

    @Override
    public void inData() {

        System.out.println("KingmaxRam内存条有效期五年");
    }

    @Override
    public void outData() {

        System.out.println("KingmaxRam内存条已使用");
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getCompany() {
        return null;
    }

    @Override
    public String toString() {
        return "KingmaxRam{" +
                "size=" + size +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", company='" + company + '\'' +
                '}';
    }
}
