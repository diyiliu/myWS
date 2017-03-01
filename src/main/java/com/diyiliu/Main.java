package com.diyiliu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description: Main
 * Author: DIYILIU
 * Update: 2016-01-15 17:15
 */
public class Main {

    public static void main(String[] args) {

        /**
        String address = "http://192.168.1.19:8989/WS/MyWebservice";
        Endpoint.publish(address, new MyWebServiceImpl());
        System.out.println("发布webservice成功!");*/

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");


    }
}
