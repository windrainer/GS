package com.nighteagle.web.controller;
import com.nighteagle.base.generic.Result;
import com.nighteagle.dto.UserDTO;
import com.nighteagle.service.IUserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.nighteagle.model.User;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {

    Log log = LogFactory.getLog(UserController.class);

    @Autowired
    IUserService userService;

    @RequestMapping(value="/login",method=RequestMethod.POST)
	public Result<UserDTO> login(@RequestParam("username") String username, @RequestParam("password") String password) {
        Result<UserDTO> result = new Result();
        try {
            UserDTO user = userService.login(username, password);

            result.setDto(user);
            if(user.getUserId()==0L)
                result.setMessage("Incorrect username or password. ");
            else
                result.setMessage("Successful Login");

        } catch (IllegalArgumentException e) {
            result.setMessage("Error:Illegal User!");
        } finally{
            return result;
        }
	}
}
