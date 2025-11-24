package com.xiaowo.teachgarden.chapter1.item1;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.*;

/**
 * @Description: 静态工厂方法代替构造器
 * @author liuhw
 * @date 2025/11/24
 */
public class StaticFactory {
    public static void main(String[] args) throws IOException {
        Father father = Father.getInstance("A");
        father.getName();
        Father father1 = Father.getInstance("B");
        father1.getName();

        ChildA childA = new ChildA();
        childA.getName();

        // 类型转换方法，一般只有单参数，返回该类型的一个相对应的实例
        Date from = Date.from(Instant.now());

        // 聚合方法，带有多个参数，返回该类型的一个实例，并把他们合并起来
        Set<Name> a = EnumSet.of(Name.A, Name.B);

        // 值转换方法，一般只有单参数，返回该类型一个实例，并把参数的值转换成该实例
        BigInteger bigInteger = BigInteger.valueOf(Integer.MAX_VALUE);

        // 创建方法，创建该类型的一个实例
        StackWalker stackWalker = StackWalker.getInstance();
        // 创建方法，创建该类型一个实例
        Object o = Array.newInstance(String.class, 10);


        // Type表示工厂方法所返回的对象类型
        Path path = Paths.get("");
        int a1 = Character.getType('a');
        FileStore fileStore = Files.getFileStore(path);
        BufferedReader bufferedReader = Files.newBufferedReader(path);

        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        // 获取 Enumeration
        /**
         *  其他常见来源的 Enumeration：
         *
         * Hashtable.keys() / Hashtable.elements()
         * ZipFile.entries()
         * ServletRequest.getAttributeNames()（Java EE）
         * 手动创建的 Enumeration
         */
        Enumeration<String> en = vector.elements();
        // 转为 List

        List<String> list = Collections.list(en);
        System.out.println(list); // [Apple, Banana, Cherry]

        Enumeration<String> myEn = new MyEnumeration();
        List<String> myList = Collections.list(myEn);
        // ======================================================


    }
}
