package com.sophossolutions.certification.alibaba.exceptions;
/**
 * Excepción para controlar el login correcto
 * @author manco.5@hotmail.com
 */
public class UnableToLogin extends AssertionError{
	
	private static final long serialVersionUID = 1L;
	private static final String UNABLE_TO_LOGIN = "Unable to login";
	public static String getUnableToLoginMessage() {
		return UNABLE_TO_LOGIN;
	}
	
	//Constructor que llama al constructor de la clase padre AssertionError
	public UnableToLogin(String message, Throwable cause) {
		super(message, cause);
	}

}
