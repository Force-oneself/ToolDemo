package com.quan.demo.freemarker.enums;

/**
 * @author Force-oneself
 * @description InternalKeyEnum
 * @date 2022-03-17
 */
public enum InternalKeyEnum {

    /**
     * 内置key枚举
     */
    ENTITY("meta", "desc"),
    CONTROLLER("key", "desc"),
    MAPPER("key", "desc"),
    SYSTEM_ENV("ENV", "系统环境变量"),
    SYSTEM_PROPERTIES("PROPERTIES", "系统变量"),
    SERVICE("key", "desc");

    private final String key;

    private final String desc;

    InternalKeyEnum(String key, String desc) {
        this.key = key;
        this.desc = desc;
    }

    public String getKey() {
        return key;
    }

    public String getDesc() {
        return desc;
    }
}
