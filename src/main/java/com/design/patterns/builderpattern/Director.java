package com.design.patterns.builderpattern;

/**
 * @Author xuetao
 * @Description: 实际操作者
 * @Date 2019-06-10
 * @Version 1.0
 */
public class Director {


    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        carBuilder.buildBMWCar().initCar();
        System.out.println("====================");
        carBuilder.buildBenzCar().initCar();

    }
}
