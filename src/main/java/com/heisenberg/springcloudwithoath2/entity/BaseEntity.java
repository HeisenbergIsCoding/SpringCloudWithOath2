package com.heisenberg.springcloudwithoath2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author ziv
 * @date 2023-10-23 8:11 PM
 * @description
 */
@Entity
@Setter
@Getter
public class BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    private Date createTime;

    private String createBy;
}
