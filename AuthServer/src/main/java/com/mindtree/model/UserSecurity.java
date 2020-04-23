package com.mindtree.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "users")
public class UserSecurity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "auth_type")
    private String authType;

    @Column(name = "password")
    private String password;

    @Column(name = "username")
    private String userName;

    @Column(name = "enabled")
    private boolean isActive;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserInfo userInfo;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public String getAuthType() {
        return authType;
    }

    public UserSecurity authType(String authType) {
        this.authType = authType;
        return this;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public String getPassword() {
        return password;
    }

    public UserSecurity password(String password) {
        this.password = password;
        return this;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
