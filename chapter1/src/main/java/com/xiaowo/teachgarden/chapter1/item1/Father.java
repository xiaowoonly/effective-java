package com.xiaowo.teachgarden.chapter1.item1;

public class Father {

    /**
     * 只有当这个类 不打算被继承（即没有子类）时，才可以用 private 构造函数，例如：
     *
     * 工具类（如 java.lang.Math）
     * 单例模式（且不被继承）
     * 纯静态工厂类
     *
     * 这里用protected 或者default
     * public 所有类都可以继承
     */
    protected Father() {
        System.out.println("I am the parent constructor");
    }

    public void getName() {
        System.out.println("I'm father");
    }

    public static Father getInstance(String type) {
        if ("A".equals(type)) {
            return new ChildA();
        } else {
            return new ChildB();
        }
    }
}
