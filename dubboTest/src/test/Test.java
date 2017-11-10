

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import geng.service.UserService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class Test {

	private static Logger logger = Logger.getLogger(Test.class);
	@Resource
	private UserService userService;
	
	private ApplicationContext ac = null;
	@Before
	public void before(){
		System.out.println("============");
		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		userService = (UserService)ac.getBean("userService");
	}
	
	@org.junit.Test
	public void test(){
		System.out.println(userService);
	}
}
