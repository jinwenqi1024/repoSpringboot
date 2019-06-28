package com.mailuo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {

    @Id //表示主键Id
    @GeneratedValue(strategy = GenerationType.AUTO)//表示Id自增
    private Integer id;

    @Column(name = "username",columnDefinition = "VARCHAR(50) NOT NULL COMMENT '用户名不为空!",unique = true)
    @NotBlank(message = "username can't be null")
    private String username;

    @Column(name = "password",columnDefinition = "VARCHAR(50) NOT NULL COMMENT '密码不为空!")
    @NotBlank(message = "password can't be null")
    private String password;

    @Temporal(TemporalType.DATE)
    @Column(name = "create_time", columnDefinition = "datetime DEFAULT NULL COMMENT '创建时间'")
    private Date createTime; //创建时间

    @Temporal(TemporalType.DATE)
    @Column(name = "update_time", columnDefinition = "datetime DEFAULT NULL COMMENT '更新时间'")
    private Date updateTime;//更新时间
// get/set方法   注：Lombok插件可以直接构建get、set方法
}
