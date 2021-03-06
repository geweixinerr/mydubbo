package org.dubbo.customer;

import org.dubbo.provider.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gewx 消费者启动主函数入口
 **/
public final class ConsumerRunMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "consumer.xml" });
		context.start();
		DemoService demoService = (DemoService) context.getBean("demoService"); // 获取远程服务代理
		String hello = demoService.sayHello("world"); // 执行远程方法
		System.out.println(hello); // 显示调用结果
	}
}
