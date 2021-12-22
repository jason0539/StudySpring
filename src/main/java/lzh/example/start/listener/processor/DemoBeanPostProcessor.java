package lzh.example.start.listener.processor;

import java.util.Objects;

import lzh.example.start.listener.bean.BeanB;
import lzh.example.utils.LogUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author daoming.lzh
 * @Date: 2021/12/17 下午12:46
 *
 * https://www.jianshu.com/p/1417eefd2ab1
 * Spring容器通过BeanPostProcessor给了我们一个机会对Spring管理的bean进行再加工
 *
 * 该Spring IOC容器所创建的每个bean实例，
 * 在初始化方法（如afterPropertiesSet和任意已声明的init方法）调用前，将会调用postProcessBeforeInitialization，
 * 而在bean实例初始化方法调用完成后，则会调用postProcessAfterInitialization方法
 * （源码位置AbstractAutowireCapableBeanFactory#initializeBean）
 */
@Component
public class DemoBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof BeanB) {
            LogUtils.line();
            LogUtils.info(this, "beanB postProcessBeforeInitialization");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof BeanB) {
            LogUtils.info(this, "beanB postProcessAfterInitialization");
            BeanB newBeanB = (BeanB)bean;
            newBeanB.setName("新名字");
            return newBeanB;
        }
        return bean;
    }
}
