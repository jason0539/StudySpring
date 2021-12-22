package lzh.example.start.listener.bean;

import javax.annotation.PostConstruct;

import lzh.example.utils.LogUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;

/**
 * @Author daoming.lzh
 * @Date: 2021/12/16 下午8:35
 */
public class BeanB implements InitializingBean {

    @Value("老名字")
    private String name;

    public BeanB() {
        LogUtils.info(this, "beanB constructor, name is " + name);
    }

    /**
     * org.springframework.beans.factory.annotation.InitDestroyAnnotationBeanPostProcessor#postProcessBeforeInitialization(java.lang.Object, java.lang.String)
     * spring内置的BeanPostProcessor实现类，其中会在postProcessBeforeInitialization时反射调用该方法
     */
    @PostConstruct
    public void testPostContruct() {
        LogUtils.info(this, "1 testPostContruct name is " + name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        LogUtils.info(this, "2 afterPropertiesSet name is " + name);
    }

    public void init() {
        LogUtils.info(this, "3 init function");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
