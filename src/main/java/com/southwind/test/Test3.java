/**
 * @auther :ZK
 * @date : Created in 2020/3/18
 * @description :
 * @version: 1.0
 **/
package com.southwind.test;

import com.southwind.entity.Student;
import com.southwind.repository.ClassesRepository;
import com.southwind.repository.CustomerRepository;
import com.southwind.repository.GoodsRepository;
import com.southwind.repository.StudentRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Test3 {
    public static void main(String[] args) {
        //加载Mybatis配置文件
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取实现接口的代理对象
        StudentRepository studentRepository = sqlSession.getMapper(StudentRepository.class);
        Student student = studentRepository.findByIdLazy(1L);
        System.out.println(student.getClasses());
//        ClassesRepository classesRepository = sqlSession.getMapper(ClassesRepository.class);
//        System.out.println(classesRepository.findByIdLazy(student.getClasses().getId()));
//        ClassesRepository classesRepository = sqlSession.getMapper(ClassesRepository.class);
//        System.out.println(classesRepository.findById(1L));
//        CustomerRepository customerRepository = sqlSession.getMapper(CustomerRepository.class);
//        System.out.println(customerRepository.findById(1L));
//        GoodsRepository goodsRepository = sqlSession.getMapper(GoodsRepository.class);
//        System.out.println(goodsRepository.findById(1L));
        sqlSession.close();
    }
}


