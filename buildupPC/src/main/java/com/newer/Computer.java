package com.newer;

import com.newer.Mainboard.AbstractMainboard;
import com.newer.Mainboard.Mainboard;
import com.newer.Ram.Ram;
import com.newer.cpu.CPU;

public class Computer {

    private Mainboard Mainboard;


    public com.newer.Mainboard.Mainboard getMainboard() {
        return Mainboard;
    }

    public void setMainboard(com.newer.Mainboard.Mainboard mainboard) {
        Mainboard = mainboard;
    }

    public void doWork(){
        System.out.println("是否工作");
    }

    public void start(){
        System.out.println("开机");
    }

    public void shutdown(){
        System.out.println("关机");
    }

    public double getPrice(){
        double price=0;
        price=Mainboard.getPrice()+Mainboard.getCpu().getPrice()+Mainboard.getRam().getPrice();
        return price;
    }

    public String getSetting(){
        String a=null;
        a="该电脑主板为："+Mainboard.getName()+"公司"+Mainboard.getCompany()+"价格："+Mainboard.getPrice()+"\n"
                +"该电脑cup为："+Mainboard.getCpu().getName()+"价格："+Mainboard.getCpu().getPrice()+"\n"
                +"该电脑内存为："+Mainboard.getRam().getName()+"价格："+Mainboard.getRam().getPrice()+"\n"
                +"总价："+this.getPrice();

        return a;
    }

}
