package com.design.patterns.factorymethod;

/**
 * @Author xuetao
 * @Description: word抽象工厂实现类
 * @Date 2019-06-01
 * @Version 1.0
 */
public class WordFileMethodFactory implements IFactoryMethod {
    @Override
    public WordFile createWordFile() throws Exception {
        return new WordFile();
    }

    @Override
    public ExcelFile createExcelFile() throws Exception {
        throw new UnsupportedOperationException();
    }
}
