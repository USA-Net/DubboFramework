package com.trus.dubbo_common.Domain;



import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -8096919250664823274L;
    private Long id;

    private String username;

    private String password;

    private Integer age;

    public Long getId() {
        return id;
    }



    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", password=" + password + ", age=" + age + "]";
    }



}