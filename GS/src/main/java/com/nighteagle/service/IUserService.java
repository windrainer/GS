package com.nighteagle.service;


import com.nighteagle.base.generic.GenericService;
import java.util.List;
import com.nighteagle.dto.UserDTO;
import com.nighteagle.model.User;

/**
 * Created by gaosen1 on 2016/10/4.
 */
public interface IUserService extends GenericService<User, Long>{

    public UserDTO login(String username, String password) throws Exception;

}
