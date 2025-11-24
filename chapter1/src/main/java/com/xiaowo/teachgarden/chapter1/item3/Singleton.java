package com.xiaowo.teachgarden.chapter1.item3;

/**
 * @Description: 用私有构造器或者枚举类型强化Singleton属性
 * @author liuhw
 * @date 2025/11/24
 */
public class Singleton {
    public static void main(String[] args) {
        Elvis elvis = Elvis.getInstance();
        elvis.leaveTheBuilding();


        ElvisEnum.INSTANCE.setName("xiaowo");
        System.out.println(ElvisEnum.INSTANCE.getName());
    }

}
