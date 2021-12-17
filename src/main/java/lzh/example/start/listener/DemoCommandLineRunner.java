package lzh.example.start.listener;

import lzh.example.utils.LogUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author daoming.lzh
 * @Date: 2021/12/16 下午8:12
 */
@Component
@Order(2)
public class DemoCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        if (args.length > 0) {
            for (String arg : args) {
                LogUtils.info(this, arg);
            }
        }
    }
}
