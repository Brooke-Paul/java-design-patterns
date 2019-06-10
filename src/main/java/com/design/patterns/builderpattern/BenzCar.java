package com.design.patterns.builderpattern;

/**
 * @Author xuetao
 * @Description: TODO
 * @Date 2019-06-10
 * @Version 1.0
 */
public class BenzCar extends Car implements CarItem {
    public BenzCar(String name, String sign, double price) {
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
        buildBody();
        buildWheel();
        buildLight();
        System.out.println("汽车" + getName() + ":::" + getSign() + ":::" + getPrice()+" 万元");
    }
}
