package com.loopino.loopino.services;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.loopino.loopino.model.User;

@Service
public class TokenService {
	  public String gerarToken(User usuario) {
	        return JWT.create()
	                .withIssuer("Usuarios")
	                .withSubject(usuario.getUsername())
	                .withClaim("user_id", usuario.getUser_id().toString())
	                .withExpiresAt(LocalDateTime.now()
	                        .plusMinutes(999)
	                        .toInstant(ZoneOffset.of("-03:00"))
	                ).sign(Algorithm.HMAC256("secreta"));
	    }


	    public String getSubject(String token) {
	        return JWT.require(Algorithm.HMAC256("secreta"))
	                .withIssuer("Usuarios")
	                .build().verify(token).getSubject();

	    }
}
