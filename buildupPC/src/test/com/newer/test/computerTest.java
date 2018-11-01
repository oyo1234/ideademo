package com.newer.test;

import com.newer.Computer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class computerTest {


    @Test
    public void TestComput(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        Computer computer=ctx.getBean("Computer1",Computer.class);
        System.out.println(computer.getSetting());

    }
}
