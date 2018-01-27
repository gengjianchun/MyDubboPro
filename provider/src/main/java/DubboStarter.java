import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DubboStarter {
    public static void main(String[] args) throws Exception {
   /*     ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        context.start();
        synchronized (DubboStarter.class) {
            while(true){
                DubboStarter.class.wait();
            }
        }*/
        
        //官方示例代码启动方式
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        context.start();

        System.in.read(); // press any key to exit
        
        
    }
}
