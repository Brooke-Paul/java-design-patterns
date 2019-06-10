package com.design.patterns.builderpattern;

/**
 * @Author xuetao
 * @Description: 汽车实体
 * @Date 2019-06-10
 * @Version 1.0
 */
public class Car {

    /**
     * 汽车名称
     */
    private String name;

    /**
     * 汽车标识
     */
    private String sign;

    /**
     * 汽车价格
     */
    private double price;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Car(String name, String sign, double price) {
        this.name = name;
        this.sign = sign;
        this.price = price;
    }
}
