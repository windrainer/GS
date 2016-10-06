package com.nighteagle.dao;

import com.nighteagle.base.generic.GenericDao;
import com.nighteagle.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper extends GenericDao<User, Long> {

    List<User> selectByUsernameAndPassword(@Param("username") String username, @Param("password")String password);

}