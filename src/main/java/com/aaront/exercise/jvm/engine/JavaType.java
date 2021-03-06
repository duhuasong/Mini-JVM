package com.aaront.exercise.jvm.engine;

/**
 * @author tonyhui
 * @since 17/6/23
 */
public enum JavaType {
    /**
     * 只定义了测试程序用到的类型, 后序还要完善
     */
    OBJECT("object", 1),
    STRING("string", 2),
    INT("int", 3),
    FLOAT("float", 4);

    private String name;
    private Integer value;

    JavaType(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Integer getValue() {
        return value;
    }
}
