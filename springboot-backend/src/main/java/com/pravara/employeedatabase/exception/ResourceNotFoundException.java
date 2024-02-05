package com.pravara.employeedatabase.exception;
//runtimeexception is internally as serielizable exception

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
  private static final long serialVersionUID= 1L;
  //we use here custom exception
  public ResourceNotFoundException(String message)
  {
	  super(message);
  }
}
