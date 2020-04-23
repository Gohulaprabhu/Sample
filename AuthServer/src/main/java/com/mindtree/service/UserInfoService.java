package com.mindtree.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.model.UserInfo;
import com.mindtree.model.UserSecurity;
import com.mindtree.repository.UserInfoRepository;
import com.mindtree.repository.UserSecurityRepository;

@Service
public class UserInfoService{

    @Autowired
    private UserInfoRepository userRepo;

    @Autowired
    private UserSecurityRepository userSeRepo;

    public UserInfo save(UserInfo userInfo) {
        return userRepo.save(userInfo);
    }

    
    public UserInfo save(UserInfo userInfo, String password) {
        UserInfo userInfoCreated = userRepo.save(userInfo);
        UserSecurity userSecurity = new UserSecurity();
        userSecurity.setPassword(password);
        userSecurity.setUserInfo(userInfo);
        userSecurity.setAuthType("AUTH_TYPE_PASSWORD");
        userSecurity.setUserName(userInfo.getEmail());
        userSecurity.setActive(true);

        userSeRepo.save(userSecurity);
        return userInfoCreated;
    }

    public boolean findUser(UserInfo userInfo) {
    	 UserSecurity userSe;
         userSe =  userSeRepo.findByuserName(userInfo.getEmail().toLowerCase());
         return userSe==null;
    }
    public UserInfo findName(String username) {
        List<UserInfo> userInfos;
        userInfos =  userRepo.findByemail(username);
        return userInfos.get(0);
    }

}

