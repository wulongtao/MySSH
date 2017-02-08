package com.xiaoxiaohei.dao;

import com.xiaoxiaohei.entity.User;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;

/**
 * Created by raid on 2017/2/5.
 */
public class UserDaoImpl extends BaseDao implements UserDao {
    /*//得到hibernateTemplate对象
    private HibernateTemplate hibernateTemplate;
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }*/

    public void add() {
        //添加
        /*User user = new User();
        user.setUsername("xiaoxiaohei");
        user.setAddress("cn");
        hibernateTemplate.save(user);*/

        //get方法，根据ID查询
        /*User user = (User) hibernateTemplate.get(User.class, 1);
        System.out.println(user);*/

        //find方法
        List<User> list = (List<User>) hibernateTemplate.find("from User ");
        list.forEach(System.out::println);


    }
}
