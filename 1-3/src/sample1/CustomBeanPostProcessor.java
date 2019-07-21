package sample1;

import org.springframework.beans.factory.config.*;

public class CustomBeanPostProcessor implements BeanPostProcessor {
    
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        System.out.println("�D初期化前のBeanに対する処理を実行");
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.out.println("�G初期化後のBeanに対する処理を実行");
        return bean;
    }        
}