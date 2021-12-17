package lzh.example.start.listener.bean;

import lzh.example.utils.LogUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author daoming.lzh
 * @Date: 2021/12/17 下午12:42
 * bean的初始化顺序
 * https://mp.weixin.qq.com/s?__biz=MzkwNzI0MzQ2NQ==&mid=2247488902&idx=1&sn=f3ba0e4925ad9293ec69cecf8916acb6&source=41#wechat_redirect
 */
@Configuration
public class BeanConfig {
    @Bean(initMethod = "init")
    public BeanC beanC() {
        LogUtils.info(this, "init beanC");
        return new BeanC();
    }
}
