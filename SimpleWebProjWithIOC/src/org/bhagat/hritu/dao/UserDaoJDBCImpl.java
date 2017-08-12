package org.bhagat.hritu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.bhagat.hritu.dto.UserDTO;
import org.bhagat.hritu.util.JdbcDataSource;

public class UserDaoJDBCImpl implements UserDaoInt {

	public UserDTO findByLogin(UserDTO dto) throws Exception {
		Connection connection = JdbcDataSource.getConnection();
		PreparedStatement ps = connection
				.prepareStatement("select * from st_user where login=? and password=?");
		ps.setString(1, dto.getUserName());
		ps.setString(2, dto.getPassword());
		ResultSet rs=ps.executeQuery();
		UserDTO foundDto=null;
		while(rs.next()){
			foundDto =new UserDTO();
			foundDto.setFirstName(rs.getString("first_name"));
			foundDto.setLastName(rs.getString("last_name"));
			foundDto.setMobileNo(rs.getString("mobile_no"));
			foundDto.setDob(rs.getDate("dob"));
		}
		rs.close();
		ps.close();
		connection.close();
		return foundDto;
	}

    public UserDTO findByPK(UserDTO dto) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

}
