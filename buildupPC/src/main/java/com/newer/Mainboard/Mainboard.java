package com.newer.Mainboard;

import com.newer.PCComponent;
import com.newer.cpu.CPU;
import com.newer.Ram.Ram;

public interface Mainboard extends PCComponent{

    void setCpu();

    CPU getCpu();

    void setRam();

    Ram getRam();

    boolean havePower();

    void startPower();

    void shutdownPower();

    @Override
    String getName();

    @Override
    double getPrice();

    @Override
    String getCompany();
}
