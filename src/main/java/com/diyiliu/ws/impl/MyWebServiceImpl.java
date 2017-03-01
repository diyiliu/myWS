package com.diyiliu.ws.impl;

import com.diyiliu.ws.MyWebService;

import javax.jws.WebService;

/**
 * Description: MyWebServiceImpl
 * Author: DIYILIU
 * Update: 2016-01-15 17:19
 */
@WebService(targetNamespace = "http://impl.ws.diyiliu.com/")
public class MyWebServiceImpl implements MyWebService{

    @Override
    public String sayHello(String name) {

        System.out.println("WebService sayHello " + name);
        return "sayHello " + name;
    }

    @Override
    public String save(String user, String password) {

        System.out.println("WebService save [" + user + "， " + password + "]");
         return "save Success";
    }
}
