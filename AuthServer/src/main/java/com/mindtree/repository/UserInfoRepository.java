package com.mindtree.repository;

import org.springframework.stereotype.Repository;

import com.mindtree.model.UserInfo;

import org.springframework.data.jpa.repository.*;

import javax.transaction.Transactional;
import java.util.List;


@SuppressWarnings("unused")
@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo,Long> {

    List<UserInfo> findByemail(String username);
}
