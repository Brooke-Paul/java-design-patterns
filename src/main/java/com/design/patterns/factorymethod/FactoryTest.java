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
    public static void main(String[] args) throws Exception {
        FactoryTest factoryTest = new FactoryTest();
        // 1. 普通工厂方法
        File file = factoryTest.downLoadFile(FileEnum.WORD_FILE);
        file.downLoadFile();

        // 2.下载excel
        IFactoryMethod iFactoryMethod = new ExcelFileMethodFactory();
        ExcelFile excelFile = iFactoryMethod.createExcelFile();
        excelFile.downLoadFile();

        // 3. 下载word
        IFactoryMethod iFactoryMethod1 = new WordFileMethodFactory();
        WordFile wordFile = iFactoryMethod1.createWordFile();
        wordFile.downLoadFile();

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
