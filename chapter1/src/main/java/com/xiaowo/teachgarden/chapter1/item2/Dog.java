package com.xiaowo.teachgarden.chapter1.item2;

public class Dog extends Animal {
    private final String breed;

    protected Dog(Builder builder) {
        super(builder);
        this.breed = builder.breed;
    }

    public static class Builder extends Animal.Builder<Dog, Builder> {

        private String breed;

        public Builder(String breed) {
            this.breed = breed;
        }

        public String getBreed() {
            return breed;
        }

        @Override
        public Dog build() {
            validate();
            return new Dog(this);
        }

        private void validate() {
            // 校验父类字段
            if (getName() == null || getName().length() == 0) {
                throw new IllegalArgumentException("Dog must have a name");
            }
        }

    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
