package com.operbean;

import com.Bean.ChunService;
import com.Bean.MeiService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author lzp
 * @version V1.0
 * @Classname LiuBeanFactoryPostProcessor
 * @Date 2020/4/1 9:29
 */
@Component
public class LiuBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        GenericBeanDefinition beanDefinition = (GenericBeanDefinition)beanFactory.getBeanDefinition("liuService");
        System.out.println(beanDefinition);
        beanDefinition.setBeanClass(ChunService.class);
        System.out.println(beanDefinition);
    }
}
