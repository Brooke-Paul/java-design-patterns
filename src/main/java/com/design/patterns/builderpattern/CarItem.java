package com.design.patterns.builderpattern;

/**
 * @Author xuetao
 * @Description: 车的基础设备
 * @Date 2019-06-10
 * @Version 1.0
 */
public interface CarItem {


    /**
     * 制造车轮
     */
    void buildWheel();

    /**
     * 制造车身
     */
    void buildBody();

    /**
     * 制造车灯
     */
    void buildLight();

}
