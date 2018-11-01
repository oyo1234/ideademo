package com.newer.cpu;

import com.newer.PCComponent;

public interface CPU extends PCComponent{


    int getSpeed();

    void doInstr();

    void outResult();

}
