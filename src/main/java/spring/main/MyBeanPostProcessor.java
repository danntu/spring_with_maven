package spring.main;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Nullable
    public Object postProcessAfterInitialization(Object object, String beanName) throws BeansException {
        return object;
    }

    @Nullable
    public Object postProcessBeforeInitialization(Object object, String beanName) throws BeansException {
        System.out.println(object+" - postProcessBeforeInitialization");
        return object;
    }
}
