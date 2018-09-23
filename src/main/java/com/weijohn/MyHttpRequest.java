package com.weijohn;

import com.weijohn.utils.HttpUtil;

/**
 * Created by vincent on 24/09/2018.
 */
public class MyHttpRequest {

    public static void main(String... args) {
        System.out.println("发送http请求开始....");
        ///////////////////////////////////////////

        HttpUtil.sendGet("http://127.0.0.1:8080?name=zxw");

        ////////////////////////////////////////////
        System.out.println("发送http请求结束....");
    }
}
