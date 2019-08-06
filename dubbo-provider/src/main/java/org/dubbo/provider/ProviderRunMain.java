package org.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gewx 生产者启动主函数入口
 **/
public final class ProviderRunMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:provider.xml" });
		context.start();
		System.in.read(); // 按任意键退出
	}
}
