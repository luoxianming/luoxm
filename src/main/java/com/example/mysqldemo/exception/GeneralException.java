package com.example.mysqldemo.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 通用异常
 *
 * @author risfeng
 * @date 2019/08/06
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class GeneralException extends RuntimeException {

  private ResultCode resultCode;

  private String originalMessage;

  private String className;

  private String methodName;

  private Object[] args;

  private static final long serialVersionUID = -2035141199410195002L;

  /**
   * 不带异常
   *
   * @param resultCode 返回code
   * @param className 类名
   * @param methodName 方法名
   * @param args 参数
   */
  public GeneralException(ResultCode resultCode, String className, String methodName,
                          Object... args) {
    super(resultCode.getMessage());
    this.className = className;
    this.methodName = methodName;
    this.resultCode = resultCode;
    this.args = args;
  }

  /**
   * 带异常
   */
  public GeneralException(ResultCode resultCode, Exception e, String className, String methodName,
                          Object... args) {
    super(e.getMessage(), e);
    this.originalMessage = e.getMessage();
    this.className = className;
    this.methodName = methodName;
    this.resultCode = resultCode;
    this.args = args;
  }
}
