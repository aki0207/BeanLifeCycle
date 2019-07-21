package sample1;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class HelloApp {
    public static void main(String[] args) {

        ApplicationContext factory = new FileSystemXmlApplicationContext("beans.xml");
        MessageBean bean = (MessageBean)factory.getBean("messageBean");
        bean.sayHello();
    }
}