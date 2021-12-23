package lzh.example.start.listener.processor;

import lzh.example.utils.LogUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @Author daoming.lzh
 * @Date: 2021/12/20 下午8:33
 *
 * https://www.cnblogs.com/duanxz/p/3750725.html
 * https://blog.csdn.net/qq_42154259/article/details/108305938
 *
 * BeanFactoryPostProcessor 对 bean definitions 发生关系，
 * 不能对bean instances 交互，对bean instances 的交互，由BeanPostProcessor的实现来处理
 */
@Component
public class DemoBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        LogUtils.info(this, "postProcessBeanFactory");
        BeanDefinition beanBDefinition = beanFactory.getBeanDefinition("beanB");
        MutablePropertyValues propertyValues = beanBDefinition.getPropertyValues();
        propertyValues.add("name", "nameFromBeanFactoryPostProcessor");
    }
}
