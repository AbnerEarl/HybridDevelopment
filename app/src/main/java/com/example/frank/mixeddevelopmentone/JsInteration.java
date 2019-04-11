package com.example.frank.mixeddevelopmentone;

/**
 * PROJECT_NAME:MixedDevelopmentOne
 * PACKAGE_NAME:com.example.frank.mixeddevelopmentone
 * USER:Frank
 * DATE:2018/6/29
 * TIME:22:30
 * DAY_NAME_FULL:星期五
 * DESCRIPTION:On the description and function of the document
 **/

import android.webkit.JavascriptInterface;

/**
 * 自己写一个类，里面是提供给H5访问的方法
 * */
public class JsInteration {

    @JavascriptInterface//一定要写，不然H5调不到这个方法
    public String back() {
        return "java里的方法返回值";
    }
}

