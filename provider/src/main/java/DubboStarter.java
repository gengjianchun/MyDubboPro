import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DubboStarter {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        context.start();
        synchronized (DubboStarter.class) {
            while(true){
                DubboStarter.class.wait();
            }
        }
    }
}
