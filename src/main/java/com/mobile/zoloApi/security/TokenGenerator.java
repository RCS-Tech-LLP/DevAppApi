/**
 * 
 */
package com.mobile.zoloApi.security;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

/**
 * @author Aman
 *
 */
public class TokenGenerator {
	public String getJWTToken(String username) {
		String secretKey = "RCS19082019#1$@123";
		List<GrantedAuthority> grantedAuthorities = AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER");

		String token = Jwts.builder().setId("softtekJWT").setSubject(username)
				.claim("authorities",
						grantedAuthorities.stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
				.setIssuedAt(new Date(System.currentTimeMillis()))

				.signWith(SignatureAlgorithm.HS512, secretKey.getBytes()).compact();

		return "Rcs " + token;

	}
}
