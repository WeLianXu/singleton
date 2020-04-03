package com.wlx.lazy;

/**
 * Mainbo.com Inc.
 * Copyright (c) 2019-~ All Rights Reserved.
 *
 * @author LZS
 * @date 2020/4/2 9:15
 * @desc:懒汉模式,精简版
 */
public class LazySingletonSimple {

    private static LazySingletonSimple INSTANCE = null;

    private LazySingletonSimple() {
    }

    public static LazySingletonSimple getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingletonSimple();
        }
        return INSTANCE;
    }
}
