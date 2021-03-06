package net.lingin.max.android.utils;

import android.content.Context;
import android.content.SharedPreferences;

import net.lingin.max.android.MainApplication;

/**
 * Created by: var_rain.
 * Created date: 2018/10/21.
 * Description: SharedPreferences轻量数据储存工具类
 */
public class SP {

    /* 储存对象 */
    private static SharedPreferences sp;
    /* 储存对象编辑器 */
    private static SharedPreferences.Editor editor;

    /* 初始化 */
    static {
        SP.sp = MainApplication.instance().getSharedPreferences("MAX_ANDROID", Context.MODE_PRIVATE);
        SP.editor = SP.sp.edit();
    }

    /**
     * 插入String类型的数据
     *
     * @param key   键
     * @param value 值
     */
    public static void put(String key, String value) {
        SP.editor.putString(key, value).apply();
    }

    /**
     * 插入Boolean类型的数据
     *
     * @param key   键
     * @param value 值
     */
    public static void put(String key, boolean value) {
        SP.editor.putBoolean(key, value).apply();
    }

    /**
     * 插入Float类型的数据
     *
     * @param key   键
     * @param value 值
     */
    public static void put(String key, float value) {
        SP.editor.putFloat(key, value).apply();
    }

    /**
     * 插入Int类型的数据
     *
     * @param key   键
     * @param value 值
     */
    public static void put(String key, int value) {
        SP.editor.putInt(key, value).apply();
    }

    /**
     * 插入Long类型的数据
     *
     * @param key   键
     * @param value 值
     */
    public static void put(String key, long value) {
        SP.editor.putLong(key, value).apply();
    }

    /**
     * 获取String类型的数据
     *
     * @param key 键
     * @param def 默认
     * @return 返回获取到的数据或默认值
     */
    public static String get(String key, String def) {
        return SP.sp.getString(key, def);
    }

    /**
     * 获取Boolean类型的数据
     *
     * @param key 键
     * @param def 默认
     * @return 返回获取到的数据或默认值
     */
    public static boolean get(String key, boolean def) {
        return SP.sp.getBoolean(key, def);
    }

    /**
     * 获取Float类型的数据
     *
     * @param key 键
     * @param def 默认
     * @return 返回获取到的数据或默认值
     */
    public static float get(String key, float def) {
        return SP.sp.getFloat(key, def);
    }

    /**
     * 获取Int类型的数据
     *
     * @param key 键
     * @param def 默认
     * @return 返回获取到的数据或默认值
     */
    public static int get(String key, int def) {
        return SP.sp.getInt(key, def);
    }

    /**
     * 获取Long类型的数据
     *
     * @param key 键
     * @param def 默认
     * @return 返回获取到的数据或默认值
     */
    public static long get(String key, long def) {
        return SP.sp.getLong(key, def);
    }

    /**
     * 删除数据
     *
     * @param key 键
     */
    public static void remove(String key) {
        SP.editor.remove(key).apply();
    }
}
