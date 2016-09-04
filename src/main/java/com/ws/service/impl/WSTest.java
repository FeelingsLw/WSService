package com.ws.service.impl;

import javax.xml.ws.Endpoint;

import com.ws.service.WSService;

public class WSTest {
	public static void main(String[] args) {
		WSService service=new WSServiceImp();
		Endpoint.publish("http://localhost:6344/ws", service);
	}
}
