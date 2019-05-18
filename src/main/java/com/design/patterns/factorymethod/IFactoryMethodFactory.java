package com.design.patterns.factorymethod;

/**
 * @Author xuetao
 * @Description: 抽象工厂实现类
 * @Date 2019-05-19
 * @Version 1.0
 */
public class IFactoryMethodFactory implements IFactoryMethod {
    @Override
    public WordFile createWordFile() {
        return new WordFile();
    }

    @Override
    public ExcelFile createExcelFile() {
        return new ExcelFile();
    }
}
