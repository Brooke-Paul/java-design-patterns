package com.design.patterns.factorymethod;

/**
 * @Author xuetao
 * @Description: 抽象工厂方法模式
 * @Date 2019-05-19
 * @Version 1.0
 */
public interface IFactoryMethod {

    /**
     * 创建word文件
     *
     * @return
     */
    WordFile createWordFile() throws Exception;

    /**
     * 创建excel文件
     *
     * @return
     */
    ExcelFile createExcelFile() throws Exception;
}
