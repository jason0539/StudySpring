package lzh.example.start.listener.bean;

import javax.annotation.PostConstruct;

import lzh.example.utils.LogUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * @Author daoming.lzh
 * @Date: 2021/12/16 下午8:32
 */
@Component
@DependsOn("beanB")
public class BeanA implements InitializingBean {

    @Autowired
    BeanB beanB;

    @PostConstruct
    public void testPostContruct() {
        LogUtils.line();
        LogUtils.info(this, "testPostContruct, beanB name is " + beanB.getName());
    }

    /**
     * 调用改方法时，spring保证当前bean依赖的所有属性都已经注入完成，postConstruct不保证
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        LogUtils.info(this, "afterPropertiesSet, beanB name is " + beanB.getName());
        LogUtils.line();
    }
}
