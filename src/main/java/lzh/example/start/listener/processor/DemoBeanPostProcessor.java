package lzh.example.start.listener.processor;

import java.util.Objects;

import lzh.example.utils.LogUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author daoming.lzh
 * @Date: 2021/12/17 下午12:46
 */
@Component
public class DemoBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (Objects.equals(beanName, "beanA")) {
            LogUtils.info(this, "beanA postProcessBeforeInitialization");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (Objects.equals(beanName, "beanA")) {
            LogUtils.info(this, "beanA postProcessAfterInitialization");
        }
        return bean;
    }
}
