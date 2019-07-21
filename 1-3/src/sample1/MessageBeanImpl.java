package sample1;
import org.springframework.beans.factory.*;

public class MessageBeanImpl implements MessageBean, BeanNameAware, BeanFactoryAware, 
InitializingBean, DisposableBean {
    
    private String greeting;
    private String name;
    private String beanName;
    private BeanFactory beanFactory;
    
    public MessageBeanImpl() {
        System.out.println("�@Bean�̃R���X�g���N�^���s");
    }
    
    public void setGreeting(String greeting) {
        this.greeting = greeting;
        System.out.println("�A�Z�b�^�[���\�b�h�̎��s");
    }
    
    // BeanNameAware�̃��\�b�h�BBeanFactory����Bean����������String beanName�ɓ���B����ł����ƒl��messageBean
    public void setBeanName(String beanName) {
        System.out.println("�BBean���̃Z�b�g");
        this.beanName = beanName;
        System.out.println(" -> " + beanName);
    }
    
    // BeanFactoryAware�̃��\�b�h�B���N���J���i�C
    public void setBeanFactory(BeanFactory beanFactory) {
        System.out.println("�CBeanFactory�̃Z�b�g");
        this.beanFactory = beanFactory;
        System.out.println(" -> " +beanFactory.getClass());
    }
    
    // xml��init-method����`����Ă���ꍇ�A�v���p�e�B�̃Z�b�g��������ɌĂ΂��B
    public void init() {
        System.out.println("�F���������\�b�h�����s");
    }
    
    public void destroy() {
        System.out.println("�I��");
    }
    
    // InitializingBean�̃��\�b�h�B�v���p�e�B�ւ̃Z�b�g������������Ă΂��B
    public void afterPropertiesSet() {
        System.out.println("�E�v���p�e�B�Z�b�g����");
    }
    
    public void sayHello() {
        System.out.println(greeting + beanName + "!");
    }
}