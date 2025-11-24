package com.xiaowo.teachgarden.chapter1.item2;


/**
 * @Description: 原始构造器模式
 * 创建一个对象时，必须指定所有必要的参数，而且这些参数不能改变。
 * @author liuhw
 * @date 2025/11/24
 */
public class OldNutritionFacts {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public OldNutritionFacts(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    public OldNutritionFacts(int servingSize, int servings, int calories) {
        this(servingSize, servings, calories, 0);
    }

    public OldNutritionFacts(int servingSize, int servings, int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    public OldNutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }

    public OldNutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }


}
