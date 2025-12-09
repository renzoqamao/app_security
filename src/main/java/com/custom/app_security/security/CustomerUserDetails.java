package com.custom.app_security.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.custom.app_security.repositories.CustomerRepository;

import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class CustomerUserDetails implements UserDetailsService{


    private final CustomerRepository customerRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return this.customerRepository.findByEmail(username).map(
            customer -> {
                var authories = List.of(new SimpleGrantedAuthority(customer.getRole()));
                return new User(customer.getEmail(),customer.getPassword(),authories);
            }).orElseThrow(()-> new UsernameNotFoundException("user not found"));
    }

    
}
