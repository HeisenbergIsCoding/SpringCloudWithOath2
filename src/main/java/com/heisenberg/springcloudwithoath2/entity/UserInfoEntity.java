package com.heisenberg.springcloudwithoath2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * @author ziv
 * @date 2023-10-23 8:07 PM
 * @description 前台使用者
 */
@Entity
@Setter
@Getter
@Table(name = "user_info")
public class UserInfoEntity extends BaseEntity {
    private String userId;
    private String password;
    private String nickName;
    private String mobilePhone;
    private boolean isLogin;
    private boolean isDel;

}
