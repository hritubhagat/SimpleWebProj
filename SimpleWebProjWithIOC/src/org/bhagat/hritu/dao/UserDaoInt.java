package org.bhagat.hritu.dao;

import java.util.List;

import org.bhagat.hritu.dto.UserDTO;

public interface UserDaoInt {
	public UserDTO findByLogin(UserDTO dto) throws Exception;
	public UserDTO findByPK(UserDTO dto) throws Exception;
	public List list(UserDTO dto) throws Exception;
}
