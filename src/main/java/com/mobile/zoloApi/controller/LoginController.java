/**
 * 
 */
package com.mobile.zoloApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mobile.zoloApi.entity.LoginEntity;
import com.mobile.zoloApi.services.LoginService;

/**
 * @author Aman
 *
 */
@RestController
@RequestMapping(value="/Login")
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	@PostMapping(value="/LoginToApp")
	public LoginEntity findUser(String login_name, String password) {
		return loginService.findUser(login_name, password);
	}
}
