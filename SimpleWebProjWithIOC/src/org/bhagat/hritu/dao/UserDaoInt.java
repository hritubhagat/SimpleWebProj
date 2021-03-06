package org.bhagat.hritu.dao;

import org.bhagat.hritu.dto.UserDTO;

public interface UserDaoInt {
	public UserDTO findByLogin(UserDTO dto) throws Exception;
	public UserDTO findByPK(UserDTO dto) throws Exception;
	public void add(UserDTO dto) throws Exception;
	public void delete(UserDTO dto) throws Exception;
	
}
