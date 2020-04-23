package com.mindtree.security;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.model.UserSecurity;
import com.mindtree.repository.UserSecurityRepository;

@Component("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {


    @Autowired
    private UserSecurityRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(final String login) {

        String lowercaseLogin = login.toLowerCase();

        UserSecurity userSecurity = userRepository.findByuserName(lowercaseLogin);

        if (userSecurity == null) {
            throw new UsernameNotFoundException("User " + lowercaseLogin + " was not found in the database");
        } else if (!userSecurity.isActive()) {
            throw new UsernameNotFoundException("User " + lowercaseLogin + " is not activated");
        }

        Collection<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        GrantedAuthority grantedAuthority = (GrantedAuthority) () -> "READ_WRITE_ACCESS";
        grantedAuthorities.add(grantedAuthority);

        return new org.springframework.security.core.userdetails.User(userSecurity.getUserName(),
                userSecurity.getPassword(), grantedAuthorities);
    }

}