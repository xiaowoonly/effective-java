package com.xiaowo.teachgarden.chapter1.item1;

import java.util.Enumeration;
import java.util.NoSuchElementException;

public class MyEnumeration implements Enumeration<String> {
    private final String[] data = {"Apple", "Banana", "Cherry"};
    private int index = 0;

    @Override
    public boolean hasMoreElements() {
        return index < data.length;
    }

    @Override
    public String nextElement() {
        if (!hasMoreElements()) {
            throw new NoSuchElementException();
        }
        return data[index++];
    }

    // 使用示例
    public static void main(String[] args) {
        Enumeration<String> en = new MyEnumeration();
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
    }
}
