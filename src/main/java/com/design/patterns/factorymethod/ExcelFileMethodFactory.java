package com.design.patterns.factorymethod;

/**
 * @Author xuetao
 * @Description: excel抽象工厂实现类
 * @Date 2019-05-19
 * @Version 1.0
 */
public class ExcelFileMethodFactory implements IFactoryMethod {
    @Override
    public WordFile createWordFile() throws Exception {
        throw new UnsupportedOperationException();
    }

    @Override
    public ExcelFile createExcelFile() throws Exception {
        return new ExcelFile();
    }
}
