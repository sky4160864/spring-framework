package uly.test;

import com.acme.services.MyServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author C.H
 * @date 2020/9/11 9:42
 */
public class CreateBeanInstanceTest {
	public static void main(String[] args) {
		// 这里我们通过xml配置实例化一个容器
		ClassPathXmlApplicationContext cc = new ClassPathXmlApplicationContext("classpath:application.xml");
		MyServiceImpl luBan = cc.getBean("myServiceImpl",MyServiceImpl.class);
		luBan.prt();
	}

	@Test
	public void test01(){
		// 这里我们通过xml配置实例化一个容器
		ClassPathXmlApplicationContext cc = new ClassPathXmlApplicationContext("classpath:application.xml");
		MyServiceImpl luBan = cc.getBean("myServiceImpl",MyServiceImpl.class);
		luBan.prt();
	}
}
