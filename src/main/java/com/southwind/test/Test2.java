/**
 * @auther :ZK
 * @date : Created in 2020/3/17
 * @description :
 * @version: 1.0
 **/
package com.southwind.test;

import com.southwind.entity.Account;
import com.southwind.repository.AccountRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        //加载Mybatis配置文件
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取实现接口的代理对象
        AccountRepository accountRepository = sqlSession.getMapper(AccountRepository.class);
        //添加对象
//        Account account = new Account(3L,"王五","789789",24);
//        accountRepository.save(account);
//        sqlSession.commit();
        //查询全部对象
//        List<Account> list = accountRepository.findAll();
//        for(Account account:list){
//            System.out.println(account);
//        }
//        sqlSession.close();

//        //通过id查询对象
//        Account account = accountRepository.findById(3L);
//        System.out.println(account);
//        sqlSession.close();
        //修改对象
//        Account account = accountRepository.findById(3L);
//        account.setUsername("小明");
//        account.setPassword("000");
//        account.setAge(18);
//        int result = accountRepository.update(account);
//        sqlSession.commit();
//        System.out.println(result);
//        sqlSession.close();
        //通过id删除对象
//        int result = accountRepository.deleteById(3L);
//        System.out.println(result);
//        sqlSession.commit();
        //通过username和age查询对象
//        System.out.println(accountRepository.findByNameAndAge("张三",22));
        //统计Account总数
//        System.out.println(accountRepository.count());
//        System.out.println(accountRepository.count2());
        //通过id查询username
        System.out.println(accountRepository.findNameById(1L));
        sqlSession.close();
    }

}


