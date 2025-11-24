package com.xiaowo.teachgarden.chapter1.item2;

/**
 * @Description: 有父类和子类都需要 Builder 时，可使用泛型抽象 Builder
 *
 * 总结：方法/成员顺序口诀
 * 字段 → 构造 → 方法 → 嵌套类
 * public → protected → private
 * 静态成员优先，嵌套类放最后
 *
 * @author liuhw
 * @date 2025/11/24
 */
public abstract class Animal {
    protected final String name;
    protected final int age;

    protected Animal(Builder<?, ?> builder) {
        this.name = builder.getName(); // 或直接 builder.name（如果字段 protected）
        this.age = builder.age;
    }

    // 供外部安全读取
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract static class Builder<T extends Animal, B extends Builder<T, B>> {
        private String name;
        private int age;

        public B name(String val) {
            this.name = val;
            B self = (B) this;
            return self;
        }

        public B age(int val) {
            this.age = val;
            B self = (B) this;
            return self;
        }

        // 构建最终对象T
        public abstract T build();

        // 提供 protected getter 供子类校验
        protected String getName() {
            return name;
        }

    }
}
