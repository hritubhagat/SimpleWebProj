package org.bhagat.hritu.dao;

import org.bhagat.hritu.dto.StudentDTO;

public interface StudentDaoInt {

    void add(StudentDTO dto) throws Exception;
    void update(StudentDTO dto) throws Exception;
}
