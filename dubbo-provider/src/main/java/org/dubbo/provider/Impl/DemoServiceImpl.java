package org.dubbo.provider.Impl;

import org.dubbo.provider.DemoService;

public class DemoServiceImpl implements DemoService {

	public String sayHello(String name) {
		return "Hello " + name;
	}

}
