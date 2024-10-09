package com.loopino.loopino.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.loopino.loopino.repository.UserRepository;

@Service
public class AuthenticationService implements UserDetailsService {
	 	
	@Autowired
	private UserRepository usuarioRepository;

	@Override
	public UserDetails loadUserByUsername(String email)
	        throws UsernameNotFoundException {
	return  usuarioRepository.findByEmail(email);
	}
}
