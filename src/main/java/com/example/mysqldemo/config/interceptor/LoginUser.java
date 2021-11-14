package com.example.mysqldemo.config.interceptor;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 登录用户信息
 *
 * @author risfeng
 * @date 2019/08/26
 */
@Data
@NoArgsConstructor
public class LoginUser implements Serializable {

  private static final long serialVersionUID = -2975127478392176414L;

  /**
   * 用户Id
   */
  @JSONField(name = "Id")
  private Long id;

  /**
   * 真实姓名
   */
  @JSONField(name = "TrueName")
  private String trueName;

  /**
   * 工号
   */
  @JSONField(name = "WorkNo")
  private String workNo;

  /**
   * GDSID
   */
  @JSONField(name = "GDSID")
  private String gdsid;

  /**
   * 用户身份id
   */
  private Integer identityId;

}
