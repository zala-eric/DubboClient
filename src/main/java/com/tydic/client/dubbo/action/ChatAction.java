package com.tydic.client.dubbo.action;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tydic.server.dubbo.service.DemoServer;

public class ChatAction {
	private Logger log = LoggerFactory.getLogger(this.getClass());
	@SuppressWarnings("resource")
	public void SayHello(){   
	    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "dubboClient.test.xml" });  
	    context.start();  
	    DemoServer demoServer = (DemoServer) context.getBean("demoService");  
	    
	    log.info("client:"+demoServer.sayHello("Morning"+"1:"+new Date())+"--3:"+new Date()+"我是客户端");
	    }  
}
