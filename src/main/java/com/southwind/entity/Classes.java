/**
 * @auther :ZK
 * @date : Created in 2020/3/18
 * @description :
 * @version: 1.0
 **/
package com.southwind.entity;

import lombok.Data;

import java.util.List;

@Data
public class Classes {
    private long id;
    private String name;
    private List<Student> students;
}


