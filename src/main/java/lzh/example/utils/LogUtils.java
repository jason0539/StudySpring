package lzh.example.utils;

import java.util.List;

/**
 * @Author daoming.lzh
 * @Date: 2021/12/16 下午8:16
 */
public class LogUtils {
    public static final void info(Object obj, String info) {
        Class<?> aClass = obj.getClass();
        System.out.println("=====" + aClass.getSimpleName() + "====>" + info);
    }

    public static final void info(Object obj, List<String> info) {
        Class<?> aClass = obj.getClass();
        System.out.println("=====" + aClass.getSimpleName() + "====>" + info);
    }
}
