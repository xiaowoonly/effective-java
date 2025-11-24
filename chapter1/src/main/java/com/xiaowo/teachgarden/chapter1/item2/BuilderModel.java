package com.xiaowo.teachgarden.chapter1.item2;

/**
 * @Description: 遇到多个构造器参数时要考虑使用构建器
 * @author liuhw
 * @date 2025/11/24
 */
public class BuilderModel {

    public static void main(String[] args) {
        NutritionFacts build = new NutritionFacts.Builder(240, 8)
                .calories(100)
                .fat(12)
                .sodium(35)
                .carbohydrate(27)
                .build();
        System.out.println(build);


        Dog dog = new Dog.Builder("Yellow")
                .age(10)
                .name("Dog")
                .build();
        System.out.println(dog);
    }

}
