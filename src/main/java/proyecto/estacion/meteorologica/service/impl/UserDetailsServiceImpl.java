package proyecto.estacion.meteorologica.service.impl;

import java.util.Collections;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import proyecto.estacion.meteorologica.entity.User;
import proyecto.estacion.meteorologica.repository.UserRepository;

@Component
public class UserDetailsServiceImpl implements UserDetailsService{
    private UserRepository userRepository;
    public UserDetailsServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        User user = userRepository.findByUserName(username);
        if(user == null){
            throw new UsernameNotFoundException(username);
        }
        return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(), Collections.emptyList());
    }
}