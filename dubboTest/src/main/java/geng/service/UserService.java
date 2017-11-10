package geng.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import geng.dao.UserManageDao;

@Service
public class UserService {

	@Autowired
	private UserManageDao userManageDao;
	
	public String test(){
		return userManageDao.getAll().toString();
	}
}
