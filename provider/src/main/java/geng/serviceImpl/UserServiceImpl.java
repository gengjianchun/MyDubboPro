package geng.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import geng.dao.UserManageDao;
import geng.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserManageDao userManageDao;
	
	public String test(){
		return userManageDao.getAll().toString();
	}
}
