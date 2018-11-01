package com.newer.Ram;

public class KingstoneRam implements Ram{

    private int size;
    private String name;
    private double price;
    private String company;

    @Override
    public int getSize() {
        return size;
    }

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
    public void inData() {
        System.out.println("KingstoneRam内存条有效期三年");
    }

    @Override
    public void outData() {

        System.out.println("KingstoneRam内存条已使用");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "KingstoneRam{" +
                "size=" + size +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", company='" + company + '\'' +
                '}';
    }
}
