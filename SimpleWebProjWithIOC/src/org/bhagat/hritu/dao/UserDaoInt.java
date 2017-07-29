package org.bhagat.hritu.dao;

import org.bhagat.hritu.dto.UserDTO;

public interface UserDaoInt {
	public UserDTO findByLogin(UserDTO dto) throws Exception;
}
