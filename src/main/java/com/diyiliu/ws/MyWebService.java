package com.diyiliu.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Description: MyWebService
 * Author: DIYILIU
 * Update: 2016-01-15 17:16
 */
public interface MyWebService {

    @WebMethod
    String sayHello(String name);

    @WebMethod
    String save(String user, String password);
}
