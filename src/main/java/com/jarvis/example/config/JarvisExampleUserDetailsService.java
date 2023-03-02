package com.jarvis.example.config;

import com.jarvis.framework.security.model.SecurityUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * @author Doug Wang
 * @since 1.8, 2023-02-12 14:33:08
 */
@Component
public class JarvisExampleUserDetailsService implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    /**
     * @see org.springframework.security.core.userdetails.UserDetailsService#loadUserByUsername(java.lang.String)
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final SecurityUser user = new SecurityUser();
        user.setId(1);
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode("123456"));
        user.setShowName(username);
        return user;
    }
}
