package com.ff.modeal.service.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ff.modeal.repository.UserDao;
import com.ff.modeal.vo.UserVo;

@Service
public class SunTestService {

	@Autowired
	private UserDao userDao;
	
	public List<UserVo> userslist(){
		return userDao.getUserList();
	}
	
}
