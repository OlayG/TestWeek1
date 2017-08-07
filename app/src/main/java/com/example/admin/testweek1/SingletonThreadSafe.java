package com.example.admin.testweek1;

/**
 * Created by Admin on 8/7/2017.
 */

public class SingletonThreadSafe {

    private static final Object instance = new Object();

    protected SingletonThreadSafe() {

    }

    //Initialized during runtime
    public static Object getInstance() {
        return instance;
    }
}
