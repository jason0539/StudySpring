package lzh.example.utils;

import java.util.List;

/**
 * @Author daoming.lzh
 * @Date: 2021/12/16 下午8:16
 */
public class LogUtils {
    public static final String LOG_PREFIX = "==";
    public static final String LOG_SPLIT = "---->";
    public static final void info(Object obj, String info) {
        Class<?> aClass = obj.getClass();
        System.out.println(LOG_PREFIX + aClass.getSimpleName() + LOG_SPLIT + info);
    }

    public static final void line() {
        System.out.println();
    }

    public static final void info(Object obj, List<String> info) {
        Class<?> aClass = obj.getClass();
        System.out.println(LOG_PREFIX + aClass.getSimpleName() + LOG_SPLIT + info);
    }
}
