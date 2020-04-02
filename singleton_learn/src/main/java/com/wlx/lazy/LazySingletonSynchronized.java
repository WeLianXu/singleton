package main.java.com.wlx.lazy;

/**
 * Mainbo.com Inc.
 * Copyright (c) 2019-~ All Rights Reserved.
 *
 * @author LZS
 * @date 2020/4/2 9:21
 * @desc:懒汉模式 加锁 synchronized
 */
public class LazySingletonSynchronized {

    private static LazySingletonSynchronized INSTANCE = null;

    private LazySingletonSynchronized() {
    }

    public static synchronized LazySingletonSynchronized getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingletonSynchronized();
        }
        return INSTANCE;
    }
}
