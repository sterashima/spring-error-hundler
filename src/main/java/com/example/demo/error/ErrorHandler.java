package com.example.demo.error;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ErrorHandler {
  @ResponseStatus(HttpStatus.NOT_FOUND)
  @ExceptionHandler({ NotFoundException.class })
  @ResponseBody
  public Map<String, Object> handleError(Exception e) {
      Map<String, Object> errorMap = new HashMap<String, Object>();
      errorMap.put("message", "データがないです");
      errorMap.put("error", e.getClass().getSimpleName());
      return errorMap;
  }
}
