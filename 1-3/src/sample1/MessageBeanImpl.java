package sample1;
import org.springframework.beans.factory.*;

public class MessageBeanImpl implements MessageBean, BeanNameAware, BeanFactoryAware, 
InitializingBean, DisposableBean {
    
    private String greeting;
    private String name;
    private String beanName;
    private BeanFactory beanFactory;
    
    public MessageBeanImpl() {
        System.out.println("�@Beanのコンストラクタ実行");
    }
    
    public void setGreeting(String greeting) {
        this.greeting = greeting;
        System.out.println("�Aセッターメソッドの実行");
    }
    
    // BeanNameAwareのメソッド。BeanFactory内のBean名が引数のString beanNameに入る。今回でいうと値はmessageBean
    public void setBeanName(String beanName) {
        System.out.println("�BBean名のセット");
        this.beanName = beanName;
        System.out.println(" -> " + beanName);
    }
    
    // BeanFactoryAwareのメソッド。ヨクワカラナイ
    public void setBeanFactory(BeanFactory beanFactory) {
        System.out.println("�CBeanFactoryのセット");
        this.beanFactory = beanFactory;
        System.out.println(" -> " +beanFactory.getClass());
    }
    
    // xmlでinit-methodが定義されている場合、プロパティのセットが完了後に呼ばれる。
    public void init() {
        System.out.println("�F初期化メソッドを実行");
    }
    
    public void destroy() {
        System.out.println("終了");
    }
    
    // InitializingBeanのメソッド。プロパティへのセットが完了したら呼ばれる。
    public void afterPropertiesSet() {
        System.out.println("�Eプロパティセット完了");
    }
    
    public void sayHello() {
        System.out.println(greeting + beanName + "!");
    }
}