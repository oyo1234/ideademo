package com.newer.Mainboard;

import com.newer.Ram.Ram;
import com.newer.cpu.CPU;

public class AbstractMainboard implements Mainboard{
    @Override
    public void setCpu() {

    }

    @Override
    public CPU getCpu() {
        return null;
    }

    @Override
    public void setRam() {

    }

    @Override
    public Ram getRam() {
        return null;
    }

    @Override
    public boolean havePower() {
        return false;
    }

    @Override
    public void startPower() {

    }

    @Override
    public void shutdownPower() {

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
}

