package com.heisenberg.springcloudwithoath2.controller;

import com.heisenberg.springcloudwithoath2.service.UserService;
import com.heisenberg.springcloudwithoath2.vo.GetSmsReqVo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ziv
 * @date 2023-10-21 8:10 PM
 * @description
 */
@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/getSmsCode")
    public Boolean getSmsCode(@RequestBody GetSmsReqVo getSmsReqVo) {
        return null;
    }


}
