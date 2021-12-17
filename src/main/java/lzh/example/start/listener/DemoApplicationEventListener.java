package lzh.example.start.listener;

import lzh.example.utils.LogUtils;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author daoming.lzh
 * @Date: 2021/12/16 下午8:24
 */
@Component
public class DemoApplicationEventListener implements ApplicationListener<ApplicationReadyEvent> {
    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        LogUtils.info(this, "applicationReadyEvent");
    }
}
