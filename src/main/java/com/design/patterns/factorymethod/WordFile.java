package com.design.patterns.factorymethod;

/**
 * @Author xuetao
 * @Description: 下载word文件
 * @Date 2019-05-19
 * @Version 1.0
 */
public class WordFile implements File {
    @Override
    public void downLoadFile() {
        System.out.println("downLoad word success");
    }
}
