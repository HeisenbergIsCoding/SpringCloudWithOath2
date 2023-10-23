package com.heisenberg.springcloudwithoath2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author ziv
 * @date 2023-10-23 8:15 PM
 * @description 是否寄送簡訊
 */
@Entity
@Getter
@Setter
@Table(name = "user_sms_code")
public class UserSmsCodeEntity extends BaseEntity {
    private String mobilePhone;
    private String smsCode;
    private Date sendTime;
}
