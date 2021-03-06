package com.redis.bulk.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.redis.bulk.service.PlateBindServiceImpl;

@RestController
public class PushNotificationController {
	
	@Autowired
	PlateBindServiceImpl mPlateBindService;
	
	@ResponseBody	
	@RequestMapping(value = "/{version}/accouting/user/external/redis/write", method = RequestMethod.GET)
    public Object writeAndReadFromCluster(@PathVariable("version") String version
    		) throws Exception{
		return mPlateBindService.saveReadData();
    }
}
