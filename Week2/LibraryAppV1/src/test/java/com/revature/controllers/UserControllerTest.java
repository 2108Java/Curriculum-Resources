package com.revature.controllers;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import com.revature.service.AuthService;
import com.revature.service.BookService;
import com.revature.service.UserService;

public class UserControllerTest {
	
	@Mock
	private AuthService authS;
	
	@Mock
	private BookService bookS;
	
	@Mock
	private UserService userS;
	
	
	private UserController userController; 
	
	@Before
	public void setup() {
		
		userS = mock(UserService.class);
		
		authS = mock(AuthService.class);
		
		
		
		
//		when(authS.validate("real", "real")).thenReturn(true);
		
		userController = new UserControllerImpl(userS, authS, bookS);
		
	}
	
	
	@Test
	public void testAuthentication() {
		
		when(authS.validate("fakey", "fakey")).thenReturn(false);
		when(authS.validate("real", "real")).thenReturn(true);
		
		
		assertFalse(userController.authenticate("fakey","fakey"));
		
		assertTrue(userController.authenticate("real", "real"));
		
	}

}
