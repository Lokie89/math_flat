package com.example.mathflat.dao;

import com.example.mathflat.dto.Subject;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface SubjectDao {
    Long create(Subject subject);
    void delete(Subject subject);
    Boolean exists(Subject subject);
}
