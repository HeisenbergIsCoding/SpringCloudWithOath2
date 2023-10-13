package com.heisenberg.springcloudwithoath2.model;

import lombok.Data;

/**
 * @author ziv
 * @date 2023-10-13 9:01 PM
 * @description 建立使用者資料
 */
@Data
public class AdminUsers {
    String id;
    String name;
    String password;
    String email;
    String phone;

}
