package lzh.example.task;

import java.util.Random;

import lzh.example.utils.LogUtils;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Author daoming.lzh
 * @Date: 2022/1/25 上午10:56
 */
@Component
@EnableScheduling
public class DemoTask {
    @Scheduled(initialDelay = 1000, fixedDelay = 59000)
    public void test() {
        LogUtils.info(this, "ccc");
    }

    public static void main(String[] args){
        Random random = new Random(10);
        for (int i = 0; i < 1000; i++) {
            int i1 = random.nextInt(10);

        }
    }
}
