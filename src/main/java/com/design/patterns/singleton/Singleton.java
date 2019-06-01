package com.design.patterns.singleton;

/**
 * @Author xuetao
 * @Description: 单例模式使用
 * @Date 2019-06-02
 * @Version 1.0
 */
public class Singleton {

    private Singleton() {
    }

    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
