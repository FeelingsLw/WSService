package com.ws.service.impl;

import javax.jws.WebService;

import com.ws.service.WSService;
@WebService(endpointInterface="com.ws.service.WSService")
public class WSServiceImp implements WSService {
		
	public String getWeatcher(String area) {
		String weather="";
		if(area.equals("北京")){
			weather="多云转晴";
		}else if(area.equals("河北")){
			weather="晴";
		}else{
			weather="未知区域";
		}
		return weather;
	}
	
}
