package com.example.mysqldemo.exception;

/**
 * @author jmc
 */

public interface ResultCode {

  /**
   * 获取结果码
   *
   * @return String Code
   */
  String getCode();

  /**
   * 获取结果信息
   *
   * @return String Message
   */
  String getMessage();
}
