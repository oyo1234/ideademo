package com.newer.Mainboard;

import com.newer.Ram.Ram;
import com.newer.cpu.CPU;

public class IntelBoard extends AbstractMainboard{
    private CPU cpu;
    private Ram ram;
    private String name;
    private double price;
    private String company;
    private boolean havePower;
    private boolean startPower;

    @Override
    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    @Override
    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public boolean isHavePower() {
        return havePower;
    }

    public void setHavePower(boolean havePower) {
        this.havePower = havePower;
    }

    public boolean isStartPower() {
        return startPower;
    }

    public void setStartPower(boolean startPower) {
        this.startPower = startPower;
    }

    @Override
    public String toString() {
        return "IntelBoard{" +
                "cpu=" + cpu +
                ", ram=" + ram +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", company='" + company + '\'' +
                ", havePower=" + havePower +
                ", startPower=" + startPower +
                '}';
    }
}
