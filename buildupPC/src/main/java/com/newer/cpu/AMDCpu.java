package com.newer.cpu;

public class AMDCpu implements CPU{
    private String name;
    private int speed;
    private double price;
    private String company;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public void doInstr() {
        System.out.println("AMDCPU被使用了");
    }

    @Override
    public void outResult() {
        System.out.println("AMDCPU被撤销了");
    }

    @Override
    public String toString() {
        return "AMDCpu{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", price=" + price +
                ", company='" + company + '\'' +
                '}';
    }
}
