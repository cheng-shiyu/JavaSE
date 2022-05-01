package com.chengshiyu.Handler;

import com.chengshiyu.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author 程世玉
 * @data 2022/4/14.
 */
@RestController
public class loginController {
    @Autowired
    private UserService userService;

    @PostMapping("/login.html")
    public Object login(@RequestBody Map map){
//        String username = (String) map.get("username");
//        String password = (String) map.get("password");
//
//        userService.checkPassword();
        return null;
    }
}
