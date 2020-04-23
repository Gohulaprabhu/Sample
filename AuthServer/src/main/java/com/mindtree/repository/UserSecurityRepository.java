package com.mindtree.repository;

import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

import com.mindtree.model.UserInfo;
import com.mindtree.model.UserSecurity;

import org.springframework.data.jpa.repository.*;



@SuppressWarnings("unused")
@Repository

public interface UserSecurityRepository extends JpaRepository<UserSecurity, Long> {

    UserSecurity findByuserName(String lowercaseLogin);
}
