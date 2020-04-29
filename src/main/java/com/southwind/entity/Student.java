/**
 * @auther :ZK
 * @date : Created in 2020/3/18
 * @description :
 * @version: 1.0
 **/
package com.southwind.entity;

import lombok.Data;

@Data
public class Student {
    private long id;
    private String name;
    private Classes classes;
}


