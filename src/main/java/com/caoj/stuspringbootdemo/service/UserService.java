package com.caoj.stuspringbootdemo.service;

import com.caoj.stuspringbootdemo.domain.Role;
import com.caoj.stuspringbootdemo.domain.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(User record);

    Map<String,Object> getAllQXByUserName(String username);
}
