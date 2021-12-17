package lzh.example.start.listener.bean;

import javax.annotation.PostConstruct;

import lzh.example.utils.LogUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @Author daoming.lzh
 * @Date: 2021/12/16 下午8:35
 */
@Component
public class BeanB implements InitializingBean {
    @PostConstruct
    public void testPostContruct() {
        LogUtils.info(this, "testPostContruct");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        LogUtils.info(this, "afterPropertiesSet");
    }
}
