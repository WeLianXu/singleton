package com.wlx.hungry;

/**
 * Mainbo.com Inc.
 * Copyright (c) 2019-~ All Rights Reserved.
 *
 * @author LZS
 * @date 2020/4/1 16:20
 * @desc:含有static的饿汉模式(静态内部类)
 */
public class HungrySingletonStatic {

    private HungrySingletonStatic() {
    }

    private static class HungrySingletonStaticInstance {
        private static final HungrySingletonStatic INSTANCE = new HungrySingletonStatic();
    }

    public static HungrySingletonStatic getInstance() {
        return HungrySingletonStaticInstance.INSTANCE;
    }
}
