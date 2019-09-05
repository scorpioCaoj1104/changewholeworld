package com.caoj.stuspringbootdemo.dao;

import com.caoj.stuspringbootdemo.domain.TestGenerator2;

public interface TestGenerator2Mapper {
    int deleteByPrimaryKey(Integer ssss);

    int insert(TestGenerator2 record);

    int insertSelective(TestGenerator2 record);
}