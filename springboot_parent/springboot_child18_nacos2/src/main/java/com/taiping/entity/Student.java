package com.taiping.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @Author jinwenqi
 * @Date 10:26 2019/6/28
 * @Project SpringBoot
 * @Description
 **/
@Data
@Entity
@Table(name = "student")
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue
    @Column(name = "sid")
    private String id;

    @Column(name = "sName")
    private String name;

    @Column(name = "sAge")
    private Date age;

    @Column(name="sSex")
    private String sex;
}
