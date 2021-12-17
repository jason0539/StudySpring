package lzh.example.start.listener;

import lzh.example.utils.LogUtils;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author daoming.lzh
 * @Date: 2021/12/16 下午8:20
 */
@Component
@Order(1)
public class DemoApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        LogUtils.info(this, args.getOptionValues("foo"));
    }
}
