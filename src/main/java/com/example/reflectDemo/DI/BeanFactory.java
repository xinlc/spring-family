package com.example.reflectDemo.DI;

import java.lang.reflect.Field;

public class BeanFactory {

    public static <T> T getBean(Class<T> clazz){
        T result = null;
        try {
            result = clazz.newInstance();

        } catch (InstantiationException e) {
            e.printStackTrace();
            System.out.println("get the " + clazz.getName() + " failed!");
            return null;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            System.out.println("get the " + clazz.getName() + " failed!");
            return null;
        }
        // 获取所有字段
        Field[] fields = clazz.getDeclaredFields();

        // 查找字段中含有依赖注入的字段，存在就进行注入
        for (Field field : fields) {
            Inject inject = field.getAnnotation(Inject.class);

            if (inject != null) {
                Object object = getBean(field.getType());
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }

                try {
                    // 赋值
                    field.set(result, object);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                    System.out.println("Inject " + field.getName() + " failed!");
                }
            }
        }
        return result;
    }
}
