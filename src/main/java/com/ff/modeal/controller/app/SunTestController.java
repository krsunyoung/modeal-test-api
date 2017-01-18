package com.ff.modeal.controller.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ff.modeal.dto.JSONResult;
import com.ff.modeal.service.app.SunTestService;
import com.ff.modeal.vo.UserVo;

@Controller
@RequestMapping("/users")
public class SunTestController {
	
	@Autowired
	private SunTestService sunTestService;
	
	@ResponseBody
	@RequestMapping( "/list" )
	public Object userlist(){
		
		List<UserVo> list = sunTestService.userslist();
		
		return JSONResult.success(list);
	}

}
