package com.example.mysqldemo.exception;

/**
 * @author jmc
 */

public enum LoginResultCode implements ResultCode {
  /**
   * 未登录
   */
  UNAUTHORIZED("用户未登录或登录超时。"),
  ;

  private String message;

  LoginResultCode(String message) {
    this.message = message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String getCode() {
    return name();
  }

  @Override
  public String getMessage() {
    return message;
  }
}
