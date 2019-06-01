package com.design.patterns.factorymethod;

import com.design.patterns.factorymethod.fileenum.FileEnum;

/**
 * @Author xuetao
 * @Description: 工厂方法测试类
 * @Date 2019-05-19
 * @Version 1.0
 */
public class FactoryTest {

    /**
     * 工厂方法测试类
     *
     * @param args
     */
    public static void main(String[] args) {
        FactoryTest factoryTest = new FactoryTest();
        // 1. 普通工厂方法
        File file = factoryTest.downLoadFile(FileEnum.WORD_FILE);
        file.downLoadFile();

        // 2.抽象工厂方法
        IFactoryMethod iFactoryMethod = new IFactoryMethodFactory();

        iFactoryMethod.createWordFile().downLoadFile();
        iFactoryMethod.createExcelFile().downLoadFile();

    }

    /**
     * 普通工厂方法
     *
     * @param fileEnum
     * @return
     */
    public File downLoadFile(FileEnum fileEnum) {
        File file = null;
        switch (fileEnum) {
            case EXCEL_FILE:
                file = new ExcelFile();
                break;
            case WORD_FILE:
                file = new WordFile();
                break;
            default:
                file = new WordFile();
                break;
        }
        return file;
    }

}
