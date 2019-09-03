package com.vamsi.SecureApp.service;

import com.vamsi.SecureApp.model.User;
import com.vamsi.SecureApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=userRepo.findByUsername(username);

        if(user==null){
            throw new UsernameNotFoundException("User 404");
        }
        return new UserPrincipal(user);
    }
}
