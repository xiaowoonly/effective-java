package com.xiaowo.teachgarden.chapter1.item3;


/**
 * @Description: 枚举单例
 * 利用单元素的枚举来实现单例（Singleton），绝对防止多次实例化
 * @author liuhw
 * @date 2025/11/24
 */
public enum ElvisEnum {
    INSTANCE;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void leaveTheBuilding() {
        System.out.println("I'm leaving the building");
    }
}
