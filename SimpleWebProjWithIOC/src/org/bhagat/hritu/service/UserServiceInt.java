package org.bhagat.hritu.service;

import org.bhagat.hritu.dto.UserDTO;

public interface UserServiceInt {
	public UserDTO authenticate(UserDTO dto) throws Exception;
}
