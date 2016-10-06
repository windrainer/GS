package com.nighteagle.service.impl;

import com.nighteagle.base.generic.GenericDao;
import com.nighteagle.base.generic.GenericServiceImpl;
import com.nighteagle.dao.UserMapper;
import com.nighteagle.dto.UserDTO;
import com.nighteagle.model.User;
import com.nighteagle.service.IUserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.lang.Exception;

/**
 * Created by gaosen1 on 2016/10/6.
 */
@Service
public class UserServiceImpl extends GenericServiceImpl<User,Long> implements IUserService {

    Log log = LogFactory.getLog(UserServiceImpl.class);

    @Resource
    private UserMapper userMapper;

    @Override
    public UserDTO login(String username, String password) throws Exception {
        List<User> list = userMapper.selectByUsernameAndPassword(username, password);
        if(list.isEmpty()) {
            UserDTO result = new UserDTO();
            result.setUserId(0L);
            return result;
        } else if(list.size()==1) {
            UserDTO result = mapModelToDTO(list.get(0));
            return result;
        } else {
            throw new IllegalArgumentException("Illegal Result");
        }


    }

    @Override
    public GenericDao<User,Long> getDao() {
        return userMapper;
    }

    private UserDTO mapModelToDTO(User user) {
        UserDTO result = new UserDTO();
        BeanUtils.copyProperties(user,result);
        return result;
    }
}
