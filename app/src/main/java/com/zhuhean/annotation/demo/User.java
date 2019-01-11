package com.zhuhean.annotation.demo;

import com.zhuhean.annotation.Builder;

/**
 * Created by zhuhean on 02/11/2017.
 */

@Builder
public class User {

    String firstName;
    String lastName;
    String nickName;
    int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public int getAge() {
        return age;
    }

}
