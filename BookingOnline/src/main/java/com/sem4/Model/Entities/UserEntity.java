package com.sem4.Model.Entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "username")
    private String username;
    @Column(name="password")
    private String password;
    @Column(name="fullname")
    private String fullname;
    @Column(name="birthday")
    private Date birthday;
    @Column(name="gender")
    private int gender;
    @Column(name="email")
    private String email;
    @Column(name="city")
    private String city;
    @Column(name="phone")
    private String phone;
    @Column(name="point")
    private int point;
    @Column(name="role_id")
    private int role_id;

}
