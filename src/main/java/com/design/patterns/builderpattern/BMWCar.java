package com.design.patterns.builderpattern;

/**
 * @Author xuetao
 * @Description: 宝马汽车
 * @Date 2019-06-10
 * @Version 1.0
 */
public class BMWCar extends Car implements CarItem {

    public BMWCar(String name, String sign, double price) {
        super(name, sign, price);
    }

    @Override
    public void buildWheel() {
        System.out.println(getName() + " 车轮制造完成");
    }

    @Override
    public void buildBody() {
        System.out.println(getName() + " 车身制造完成");
    }

    @Override
    public void buildLight() {
        System.out.println(getName() + " 车灯制造完成");
    }

    public void initCar() {
        buildWheel();
        buildBody();
        buildLight();
        System.out.println("汽车" + getName() + ":::" + getSign() + ":::" + getPrice() + " 万元");
    }
}
