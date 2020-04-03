package com.wlx.hungry;

/**
 * Mainbo.com Inc.
 * Copyright (c) 2019-~ All Rights Reserved.
 *
 * @author LZS
 * @date 2020/4/1 16:19
 * @desc:最基础的饿汉模式
 */

public class HungrySingletonSimple {

    private static final HungrySingletonSimple INSTANCE = new HungrySingletonSimple();

    private HungrySingletonSimple() {
    }

    public static HungrySingletonSimple getInstance() {
        return INSTANCE;
    }
}
