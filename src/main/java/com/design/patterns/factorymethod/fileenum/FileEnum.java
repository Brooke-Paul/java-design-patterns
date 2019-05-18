package com.design.patterns.factorymethod.fileenum;

/**
 * @Author xuetao
 * @Description: 文件Enum
 * @Date 2019-05-19
 * @Version 1.0
 */
public enum FileEnum {

    /**
     * word
     */
    WORD_FILE("word"),

    /**
     * excel
     */
    EXCEL_FILE("excel");


    FileEnum(String value) {
        this.value = value;
    }

    final String value;

    public String getValue() {
        return value;
    }
}
