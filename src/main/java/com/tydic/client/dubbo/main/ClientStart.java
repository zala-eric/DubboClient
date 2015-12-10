package com.tydic.client.dubbo.main;

import com.tydic.client.dubbo.action.ChatAction;

public class ClientStart {

	public static void main(String[] args) {
		ChatAction act = new ChatAction();  
        act.SayHello();
        System.out.println("github 测试!");
	}

}
