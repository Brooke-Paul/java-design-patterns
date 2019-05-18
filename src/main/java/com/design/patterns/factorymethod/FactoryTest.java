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
        File file = factoryTest.createFile(FileEnum.WORD_FILE);
        file.downLoadFile();
    }


    public File createFile(FileEnum fileEnum) {
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
