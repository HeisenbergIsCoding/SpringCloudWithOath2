package com.heisenberg.springcloudwithoath2.vo;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author ziv
 * @date 2023-10-21 8:21 PM
 * @description 設定前端傳入的參數
 */
@Data
public class GetSmsReqVo implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String reqId;
    private String mobilePhone;
}
