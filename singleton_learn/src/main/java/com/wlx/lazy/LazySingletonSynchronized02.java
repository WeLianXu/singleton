package com.wlx.lazy;

/**
 * Mainbo.com Inc.
 * Copyright (c) 2019-~ All Rights Reserved.
 *
 * @author LZS
 * @date 2020/4/2 9:53
 * @desc:懒汉模式 高效 加锁   这个高效就在于只对实例为空时加锁,同时多加一个If 判断更加保证 实例为空才能创建
 *       至于volatile 限制指令重排序保证线程顺利进行
 */
public class LazySingletonSynchronized02 {

    private volatile static LazySingletonSynchronized02 INSTANCE = null;

    private LazySingletonSynchronized02(){}

    public static LazySingletonSynchronized02 getInstance(){
        if (INSTANCE == null){
            synchronized (LazySingletonSynchronized02.class){
                if (INSTANCE ==null){
                    INSTANCE = new LazySingletonSynchronized02();
                }
            }
        }
        return INSTANCE;
    }
}
