package com.mindtree.controller;

import java.security.Principal;

import javax.xml.ws.RequestWrapper;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.model.UserInfo;
import com.mindtree.service.UserInfoService;

@RestController
@RequestMapping("/")
public class UserInfoResource {

    @Autowired
    private UserInfoService userInfoService;

    @PostMapping("/user/signup")
    public ResponseEntity<String> createUserInfo(@RequestBody UserInfo userInfo, @RequestHeader(name = "x-pass")
            String password){
        if (userInfo.getId() != null) {
            return ResponseEntity.badRequest().body("error");
        } else if (StringUtils.isEmpty(password)) {
            return ResponseEntity.badRequest().body("Enter Password");

        }else if(userInfoService.findUser(userInfo)) {
        	userInfoService.save(userInfo, password);
            return ResponseEntity.accepted().body("successfully registered,Please login");
        }
		return ResponseEntity.badRequest().body("User already exist,Please login");
        
    }

    @GetMapping("/users")
    public UserInfo getUsers(Principal p) {
    	return userInfoService.findName(p.getName());
    }
    @RequestMapping("/Health")
    public String test() {
        return "Auth Server is up";
    }

   }
