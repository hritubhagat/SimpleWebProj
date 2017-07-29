package org.bhagat.hritu.service;

import org.bhagat.hritu.dao.UserDaoInt;
import org.bhagat.hritu.dto.UserDTO;

public class UserServiceBeanImpl implements UserServiceInt{
	private UserDaoInt userDao;
	
	public void setUserDao(UserDaoInt userDao) {
		this.userDao = userDao;
	}

	public UserDTO authenticate(UserDTO dto) throws Exception{
		return userDao.findByLogin(dto);
	}

}
