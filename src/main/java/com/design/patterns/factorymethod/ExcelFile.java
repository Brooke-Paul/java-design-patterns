package com.design.patterns.factorymethod;

/**
 * @Author xuetao
 * @Description: 下载excel
 * @Date 2019-05-19
 * @Version 1.0
 */
public class ExcelFile implements File {

    @Override
    public void downLoadFile() {
        System.out.println("downLoad excel success");
    }
}
