package com.design.patterns.builderpattern;

/**
 * @Author xuetao
 * @Description: 构造类负构建汽车对象
 * @Date 2019-06-10
 * @Version 1.0
 */
public class CarBuilder {

    public BMWCar buildBMWCar() {
        CarItem car = new BMWCar("z4", "宝马", 50);
        return (BMWCar) car;
    }

    public BenzCar buildBenzCar() {
        CarItem car = new BenzCar("c200L", "奔驰", 30);
        return (BenzCar) car;
    }
}
