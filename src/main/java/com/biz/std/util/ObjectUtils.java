package com.biz.std.util;

/**
 * @author serena
 * @date 2017/12/15
 */
public class ObjectUtils {
    public static Integer[] batchObjectToInt(Object[] objects) {
        Integer[] integers = new Integer[objects.length];
        for (int i = 0; i < objects.length; i++) {
            integers[i] = Integer.parseInt(objects[i].toString());
        }
        return integers;
    }

    public static Float[] batchObjectToFloat(Object[] objects) {
        Float[] floats = new Float[objects.length];
        for (int i = 0; i < objects.length; i++) {
            floats[i] = Float.parseFloat(objects[i].toString());
        }
        return floats;
    }
}