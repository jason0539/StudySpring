package lzh.example.start.listener.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import lzh.example.utils.LogUtils;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;

/**
 * bean的生命周期
 * https://mmbiz.qpic.cn/mmbiz_jpg/N1knSK6wthrTACm6PyA7ibkfuwDjDCCfu67FT6rVtMRjdyQn2D4xUZkQ8NFcgxgz0MHhSjGfx2IZAgG8f9z3tbg/640?wx_fmt=jpeg&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1
 *
 * @Author daoming.lzh
 * @Date: 2021/12/16 下午8:35
 */
public class BeanB implements InitializingBean, DisposableBean {

    @Value("老名字")
    private String name;

    public BeanB() {
        LogUtils.info(this, "beanB constructor, name is " + name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * 初始化方法
     */
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

    /**    销毁方法
     * https://mp.weixin.qq.com/s?__biz=MzkwNzI0MzQ2NQ==&mid=2247488903&idx=1&sn=87b83ebeba6be8250f1c9c8686186d87&source=41#wechat_redirect
     */

    @PreDestroy
    public void testPreDestroy(){
        LogUtils.info(this, "1 PreDestroy annotation");
    }

    @Override
    public void destroy() throws Exception {
        LogUtils.info(this, "2 destroy method from DisposableBean");
    }

    public void destroyIt() {
        LogUtils.info(this, "3 custom destroy method");
    }

}
