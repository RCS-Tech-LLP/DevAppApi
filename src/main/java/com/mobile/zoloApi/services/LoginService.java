/**
 * 
 */
package com.mobile.zoloApi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.zoloApi.encryption.EncrypterDecrypter;
import com.mobile.zoloApi.entity.LoginEntity;
import com.mobile.zoloApi.repository.LoginRepository;
import com.mobile.zoloApi.security.TokenGenerator;

/**
 * @author Aman
 *
 */
@Service
public class LoginService {
	@Autowired
	private LoginRepository loginRepository;

	public LoginEntity findUser(String login_name, String password) {
		final String secretKey = "RCS19082019#1$@123";
		String encLoginName = EncrypterDecrypter.encrypt("Akarsh", secretKey);
		String encLoginPass = EncrypterDecrypter.encrypt("123", secretKey);
		System.out.println("encLoginName-->"+encLoginName);
		System.out.println("encLoginPass-->"+encLoginPass);
		String DecryptedLoginName = EncrypterDecrypter.decrypt(login_name, secretKey);// encdec.DecryptString(login_name);
		String DecryptedPassword = EncrypterDecrypter.decrypt(password, secretKey);// encdec.DecryptString(password);
		TokenGenerator tokenGenerator = new TokenGenerator();
		String token = tokenGenerator.getJWTToken(DecryptedLoginName);
		LoginEntity user = new LoginEntity();
		user.setLogin_name(DecryptedLoginName);
		user.setAuth_token(token);
		LoginEntity result = loginRepository.findUser(DecryptedLoginName, DecryptedPassword);
		if(result==null) {
			return result;
		}else {
			return result;
		}
	}
}
